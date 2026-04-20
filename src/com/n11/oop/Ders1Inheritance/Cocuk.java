package com.n11.oop.Ders1Inheritance;

public class Cocuk extends Insan {

    public String sifat;

    public void cocukBilgileriYazdir() {
        System.out.println(this.ad + " " + this.soyad + "bir " + this.sifat + " çocuktur.");
    }
}
