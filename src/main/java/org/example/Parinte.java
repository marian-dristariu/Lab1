package org.example;

public class Parinte {

    String nume;
    public void afiseaza() {
        System.out.println(this.nume+" (Parinte)");
    }

    public Parinte(String nume) {
        this.nume = nume;
    }

    public String aduNume() {
        return this.nume;
    }

}
