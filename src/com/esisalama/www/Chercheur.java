package com.esisalama.www;

public class Chercheur extends Enseignant{

    int salaire;

    public Chercheur(String nom, String prenom, int nombreHeures) {
        super(nom, prenom, nombreHeures);
        this.salaire = 2000;
    }


    public int calculerSalaire(){
        int heures = getNombreHeures();
        if(heures>192){
            int heureSup = heures - 192;
            salaire = salaire * 12 * heureSup * 40;
        } else {
            salaire = 200 * 12;
        }
        return  salaire + getCharge();
    }
}
