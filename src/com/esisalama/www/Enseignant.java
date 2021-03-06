package com.esisalama.www;

public abstract class Enseignant {
    private String nom;
    private String prenom;
    private int nombreHeures;
    private final int charge = 100;

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

    @Override
    public String toString() {
        return getPrenom() + " " + getNom() + "\n" +
                "Nombre d'heures : " +getNombreHeures() + "\n" +
                "Cout A l'Universit√© : " + calculerSalaire();
    }

    public int getCharge() {
        return charge;
    }
}
