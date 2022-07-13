package com.esisalama.www;

public abstract class Enseignant {
    String nom;
    String prenom;
    int nombreHeures;
    final int charge = 100;

    public Enseignant(String nom, String prenom, int nombreHeures) {
        this.nom = nom;
        this.prenom = prenom;
        this.nombreHeures = nombreHeures;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    abstract int calculerSalaire();

    public int getCharge() {
        return charge;
    }
}
