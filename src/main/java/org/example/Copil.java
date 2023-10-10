package org.example;

public class Copil extends Parinte {

    public void afiseaza() {
        System.out.println(this.nume+" (Copil)");
    }

    public Copil(String nume) {
        super(nume);
    }
}
