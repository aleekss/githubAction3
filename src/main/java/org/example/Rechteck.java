package org.example;

public class Rechteck {
    float laenge;
    float breite;

    Rechteck(float laenge, float breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public float berechneFlaeche(){
        float flaeche = 0;

        flaeche = this.laenge * this.breite;


        return flaeche;
    }
}