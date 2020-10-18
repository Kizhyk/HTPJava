package com.kizhyk.homework4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {
    private static final int DEFAULT_SIZE = 0;
    private static final int GROW_SIZE = 1;
    private T[] data;

    public DataContainer(Class<T> type, int size) {
        data = (T[]) Array.newInstance(type, size);
    }

    public DataContainer(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }

    private void grow() {
        data = Arrays.copyOf(data, data.length + GROW_SIZE);
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        grow();
        return add(item);
    }
}