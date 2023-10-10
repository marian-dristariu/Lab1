package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void sorteaza(ArrayList<Parinte> list) {
        list.sort((o1, o2) -> o1.aduNume().compareToIgnoreCase(o2.aduNume()));
    }

    public static void main(String[] args) {

        List<Parinte> listaOameni = new ArrayList<>();

        listaOameni.add(new Parinte("Marian"));
        listaOameni.add(new Parinte("Adi"));
        listaOameni.add(new Copil("Sami"));
        listaOameni.add(new Copil("Robert"));
        listaOameni.add(new Parinte("literamica"));


        System.out.println("Nesortat: ");
        listaOameni.forEach((om) -> om.afiseaza());

        //Sortare lista dupa nume

        sorteaza((ArrayList<Parinte>) listaOameni);

        System.out.println("Sortate: ");
        listaOameni.forEach((om) -> om.afiseaza());
    }
}