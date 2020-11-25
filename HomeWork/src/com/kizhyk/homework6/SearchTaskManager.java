package com.kizhyk.homework6;

import com.kizhyk.homework5.ISearchEngine;

import java.util.concurrent.Callable;

public class SearchTaskManager {
    public static Callable<Long> createTask(ISearchEngine engine, String text, String word) {
        return () -> engine.search(text, word);
        //return new SearchTask(engine, text, word);
    }

    public static class SearchTask implements Callable<Long> {
        private final ISearchEngine engine;
        private final String text;
        private final String word;

        public SearchTask(ISearchEngine engine, String text, String word) {
            this.engine = engine;
            this.text = text;
            this.word = word;
        }

        @Override
        public Long call() throws Exception {
            return engine.search(text, word);
        }
    }
}