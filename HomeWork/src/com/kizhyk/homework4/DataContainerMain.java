package com.kizhyk.homework4;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(Integer.class);

        testAdd(container);

        System.out.println(container.size());

        printDelimiter();

        testGet(container);

        testGetItems(container);

        DataContainer.sort(container);

        System.out.println(container.toString());

        printDelimiter();

        testDelIndex(container);
        testDelItem(container);

    }

    public static void printDelimiter() {
        System.out.println("\n--------------------------------------------\n");
    }

    public static void testAdd(DataContainer container) {
        for (int i = 0; i < 10; i++) {
            System.out.println(container.add((int) (Math.random() * 10)));
        }

        System.out.println(container.add(null));

        printDelimiter();
    }

    public static void testGet(DataContainer container) {
        System.out.println(container.get(0));
        System.out.println(container.get(-1));
        System.out.println(container.get(20));

        printDelimiter();
    }

    public static <T> void testGetItems(DataContainer<T> container) {
        for (T i : container.getItems()) {
            System.out.println(i);
        }

        printDelimiter();
    }

    public static void testDelIndex(DataContainer container) {
        System.out.println(container.delete(3));
        System.out.println(container.delete(30));
        System.out.println(container.toString());
        printDelimiter();
    }

    public static void testDelItem(DataContainer container) {
        System.out.println(container.delete(container.get(4)));
        System.out.println(container.delete(Integer.valueOf(81)));
        System.out.println(container.toString());
        printDelimiter();
    }
}