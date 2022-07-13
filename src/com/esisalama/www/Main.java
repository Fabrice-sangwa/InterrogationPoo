package com.esisalama.www;

public class Main {
    public static void main(String[] args) {

        Doctorant doctorant = new Doctorant("Jean", "Marc", 200);
        Chercheur chercheur = new Chercheur("SANGWA", "Fabrice", 200);

        System.out.println(chercheur.toString());
    }
}