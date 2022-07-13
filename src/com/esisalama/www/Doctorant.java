package com.esisalama.www;

public class Doctorant extends  Enseignant{

    public Doctorant(String nom, String prenom, int nombreHeures) {
        super(nom, prenom, nombreHeures);
    }

    @Override
    int calculerSalaire() {
        int salaire = 0;
        if(getNombreHeures() >= 96){
            salaire = 30 * 96;
        } else if (getNombreHeures()< 96){
            salaire = 30 * getNombreHeures();
        }
        return salaire + getCharge();
    }


}
