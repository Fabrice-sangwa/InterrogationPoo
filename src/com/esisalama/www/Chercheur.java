package com.esisalama.www;

public class Chercheur extends Enseignant{

    int salaire;

    public Chercheur(String nom, String prenom, int nombreHeures) {
        super(nom, prenom, nombreHeures);
        this.salaire = 2000;
    }


    public int calculerSalaire(){
        int salaireHeureSup;
        if(getNombreHeures()>192){
             salaireHeureSup =  (getNombreHeures() - 192) * 40;
            salaire = salaire * 12 + salaireHeureSup;
        } else {
            salaire = 2000 * 12;
        }
        return  salaire + getCharge();
    }
}
