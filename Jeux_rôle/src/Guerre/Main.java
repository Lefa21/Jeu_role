package Guerre;

import Guerre.*;

public class Main {
    public static void main(String[] args) {
        Porteur Fares,faiz;
        Soldat Fael;

        Fael = new Soldat("Fael",84);
        Fares = new Cavalier("Fares",85,30);
        faiz = new Brancardier("faiz",82,40);

        System.out.println(faiz.toString());
        faiz.decharger(20);
        System.out.println(faiz.toString());

        System.out.println(Fares.toString());
        Fares.decharger(30);
        System.out.println(Fares.toString());

        System.out.println(Fael.toString());

        Troupe LesFrero = new Troupe();

        LesFrero.ajoutSoldat(faiz);
        LesFrero.ajoutSoldat(Fares);
        LesFrero.ajoutSoldat(Fael);

        System.out.println("La vitesse max du convoi est de : " + LesFrero.vitesseMaxConvoi() + " km/h");


    }
}