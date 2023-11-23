package org.example;

import static org.junit.jupiter.api.Assertions.*;
class RechteckTest {

        @org.junit.jupiter.api.Test
        void berechneFlaeche() {
            Rechteck rechteck = new Rechteck(5,3);
            assertEquals(15, rechteck.berechneFlaeche());
        }

  
}