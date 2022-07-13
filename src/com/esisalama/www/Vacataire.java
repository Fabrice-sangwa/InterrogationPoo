package com.esisalama.www;

public class Vacataire extends Enseignant{

    private String organisme = "";
    public Vacataire(String nom, String prenom, int nombreHeures, String organisme) {
        super(nom, prenom, nombreHeures);
        this.organisme  = organisme;
    }

    @Override
    int calculerSalaire() {
        int salaire = 40 * getNombreHeures();
        return  salaire + getCharge();
    }

    @Override
    public String toString() {
        return getPrenom() + " " + getNom() + "\n" +
                "Nombre d'heures : " +getNombreHeures() + "\n" +
                "Organisme : " + organisme + "\n" +
                "Cout A l'Université : " + calculerSalaire();

    }
}
