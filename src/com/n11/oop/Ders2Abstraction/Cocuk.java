package com.n11.oop.Ders2Abstraction;

import com.n11.oop.Ders2Abstraction.Interfaces.IDers;


public class Cocuk extends Insan implements IDers {

    public String sifat;

    @Override
    public void tanitim() {
        System.out.println("Ben çocuğum.");
    }

    public void cocukBilgileriYazdir() {
        System.out.println(this.ad + " " + this.soyad + "bir " + this.sifat + " çocuktur.");
    }

    @Override
    public void dersCalis() {
        System.out.print(" Ders calisiyor.");
    }
}
