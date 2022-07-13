package com.esisalama.www;

public class Vacataire extends Enseignant{

    String organisme = "";
    public Vacataire(String nom, String prenom, int nombreHeures, String organisme) {
        super(nom, prenom, nombreHeures);
        this.organisme  = organisme;
    }

    @Override
    int calculerSalaire() {
        int salaire = 40 * getNombreHeures();
        return  salaire + getCharge();
    }
}
