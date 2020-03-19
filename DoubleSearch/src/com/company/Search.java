package com.company;

public class Search {
    public static int bruteFroce(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println(array[i]);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(double[] array, double key) {
        return binarySearchRecursive(array, key, 0, array.length);
    }

    private static int binarySearchRecursive(double[] array, double key, int low, int high) {
        int middle = (high + low) / 2;
        if (high < low) {
            return -1;
        }
        if (key == array[middle]) {
            System.out.println(array[middle]);
            return middle;
        } else if (key < array[middle]) {
            return binarySearchRecursive(array, key, low, middle - 1);
        } else return binarySearchRecursive(array, key, middle + 1, high);
    }

    public static double[] generateArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
}
