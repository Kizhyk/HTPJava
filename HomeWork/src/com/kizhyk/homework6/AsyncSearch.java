package com.kizhyk.homework6;

import com.kizhyk.homework5.ISearchEngine;
import com.kizhyk.homework5.RegExSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class AsyncSearch implements ISearchEngine {
    private final int partNumber;
    private final ISearchEngine engine;

    public int getPartNumber() {
        return partNumber;
    }

    public ISearchEngine getEngine() {
        return engine;
    }

    public AsyncSearch(int partNumber, ISearchEngine engine) {
        this.partNumber = partNumber;
        this.engine = engine;
    }

    public AsyncSearch() {
        this(5, new RegExSearch());
    }

    public AsyncSearch(ISearchEngine engine) {
        this(5, engine);
    }

    public AsyncSearch(int partNumber) {
        this(partNumber, new RegExSearch());
    }


    @Override
    public long search(String text, String word) {
        String[] parts = Formatter.split(text, partNumber);
        List<Future<Long>> futures = new ArrayList<>(partNumber);
        ExecutorService service = Executors.newFixedThreadPool(partNumber);

        for (int i = 0; i < partNumber; i++) {
            futures.add(service.submit(SearchTaskManager.createTask(engine, parts[i], word)));
        }
        service.shutdown();

        Function<Future<Long>, Long> operation = x -> {
            try {
                return x.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        };

        return futures.stream().map(operation).mapToLong(x -> x).sum();
    }
}
