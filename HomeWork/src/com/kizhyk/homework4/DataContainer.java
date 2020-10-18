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

    public T get(int index) {
        return (index >= data.length || index < 0) ? null : data[index];
    }

    public T[] getItems() {
        return data;
    }

    public int size() {
        return data.length;
    }

    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        }

        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        data = Arrays.copyOf(data, data.length - 1);

        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (item.equals(data[i])) {
                return delete(i);
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        boolean needDelimiter = false;

        for (T element : data) {
            if (element != null) {
                if (needDelimiter) {
                    str.append(", ");
                } else {
                    needDelimiter = true;
                }
                str.append(element.toString());
            }
        }

        return str.toString().trim();
    }
}