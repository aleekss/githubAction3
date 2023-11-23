package org.example;

public class Rechteck {
    float laenge;
    float breite;

    Rechteck(float laenge, float breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public void berechneFlaeche(){
        float flaeche = 0;

        flaeche = this.laenge * this.breite;

        System.out.println(flaeche);
    }
}