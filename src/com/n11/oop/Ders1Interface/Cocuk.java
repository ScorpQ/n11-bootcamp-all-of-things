package com.n11.oop.Ders1Interface;

import com.n11.oop.Ders1Interface.Interfaces.IDers;
import com.n11.oop.Ders1Interface.Interfaces.IMaket;


// Cocuk sadece ders calismalı, interface sayesinde sadece bu methodları implemente ettik.
// Ayrıca eğer implemente etmezsek kesinlikle hata alırız. Hataları engelemek için override ederek sözleşmedeki
// methodları kesinlikle eklemek zorundayız.
public class Cocuk extends Insan implements IDers {

    public String sifat;

    public void cocukBilgileriYazdir() {
        System.out.println(this.ad + " " + this.soyad + "bir " + this.sifat + " çocuktur.");
    }

    @Override
    public void dersCalis() {
        System.out.print(" Ders calisiyor.");
    }
}
