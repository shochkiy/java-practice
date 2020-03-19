package com.company;

import java.util.ArrayList;

public class Units {

    private ArrayList<Integer> mass = new ArrayList<>();
    private ArrayList<Integer> value = new ArrayList<>();
    private ArrayList<Integer> result = new ArrayList<>();

    public Units(ArrayList<Integer> mass, ArrayList<Integer> value) {
        if (mass.size() == value.size()) {
            this.mass = mass;
            this.value = value;
        } else {
            System.out.println("Massive not have equals size");
        }
    }

    public int randomElement() {
        for (int i = 0; i < mass.size(); i++) {
            for (int j = 0; j < value.get(i); j++) {
                result.add(mass.get(i));
            }
        }

        int summ = 0;
        for (int i = 0; i < value.size(); i++) {
            summ += value.get(i);
        }

        return result.get((int) (Math.random() * summ));
    }

}
