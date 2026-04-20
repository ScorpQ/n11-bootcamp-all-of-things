package com.n11.oop.Ders1Interface;

import com.n11.oop.Ders1Interface.Interfaces.IOku;
import com.n11.oop.Ders1Interface.Interfaces.IYaz;


// Anne sadece okumalı ve yazmalı, interface sayesinde sadece bu methodları implemente ettik.
// Ayrıca eğer implemente etmezsek kesinlikle hata alırız. Hataları engelemek için override ederek sözleşmedeki
// methodları kesinlikle eklemek zorundayız.
public class Anne extends Insan implements IOku, IYaz {
    @Override
    public void oku() {
        System.out.print(" okuyor");
    }

    @Override
    public void yaz() {
        System.out.print(" yazıyor");
    }
}
