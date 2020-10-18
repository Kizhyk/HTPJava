package com.kizhyk.homework4;

import java.lang.reflect.Array;

public class DataContainer<T> {
    private static final int DEFAULT_SIZE = 0;
    private T[] data;

    public DataContainer(Class<T> type, int size) {
        data = (T[]) Array.newInstance(type, size);
    }

    public DataContainer(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }
}