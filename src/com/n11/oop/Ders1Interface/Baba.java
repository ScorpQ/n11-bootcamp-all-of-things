package com.n11.oop.Ders1Interface;

import com.n11.oop.Ders1Interface.Interfaces.IDinle;
import com.n11.oop.Ders1Interface.Interfaces.IOku;


// Baba sadece okumalı ve dinlemeliydi, interface sayesinde sadece bu methodları implemente ettik.
// Ayrıca eğer implemente etmezsek kesinlikle hata alırız. Hataları engelemek için override ederek sözleşmedeki
// methodları kesinlikle eklemek zorundayız.
public class Baba extends Insan implements IOku, IDinle {
    @Override
    public void dinle() {
        System.out.print(" dinliyor.");

    }

    @Override
    public void oku() {
        System.out.print(" okuyor.");
    }
}
