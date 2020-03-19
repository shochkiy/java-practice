package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = Search.generateArray(100000000);
        Arrays.sort(array);

        long time = System.currentTimeMillis();
        System.out.println(Search.bruteFroce(array, array[9846573]));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(Search.binarySearchRecursive(array, array[9846573]));
        System.out.println(System.currentTimeMillis() - time);
	}
}
