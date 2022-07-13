package com.esisalama.www;
/*

KAPENDA MUTALENU Jean-Marc L2MSI
SANWGA MAYOMBO Fabrice L2 GL

*/
public class Main {
    public static void main(String[] args) {

        //Quelques exemples

        Doctorant doctorant = new Doctorant("KAPENDA", "Jean-MAARC", 200);
        Chercheur chercheur = new Chercheur("SANGWA", "Fabrice", 200);
        Vacataire vacataire = new Vacataire("KALEMNGA", "Lucien",230, "UNH");

        System.out.println(vacataire.toString() + "\n*******\n" + chercheur.toString() + "\n*******\n" + doctorant.toString());


    }
}
