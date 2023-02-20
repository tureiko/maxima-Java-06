package org.example.model;

public class Sphynx implements Cat{
    private String name = "Рамзес";
    private int weight=2;

    @Override
    public String toString() {
        return "Sphynx{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
