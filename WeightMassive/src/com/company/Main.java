package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        mass.add(1);
        mass.add(2);
        mass.add(3);
        ArrayList<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(10);

	    Units units = new Units(mass, value);
        System.out.println(units.randomElement());
    }
}
