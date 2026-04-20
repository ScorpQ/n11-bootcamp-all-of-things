package com.n11.oop.Ders1Interface;

import com.n11.oop.Ders1Interface.Interfaces.IMaket;
import com.n11.oop.Ders1Interface.Interfaces.ISofra;
import com.n11.oop.Ders1Interface.Interfaces.ITemizlik;


// Anne sadece sofra hazırlamalı ve temizlik yapmalı, interface sayesinde sadece bu methodları implemente ettik.
// Ayrıca eğer implemente etmezsek kesinlikle hata alırız. Hataları engelemek için override ederek sözleşmedeki
// methodları kesinlikle eklemek zorundayız.
public class Anne extends Insan implements ITemizlik, ISofra {
    @Override
    public void temizlikYap() {
        System.out.print(" okuyor");
    }

    @Override
    public void sofraHazirla() {
        System.out.print(" yazıyor");
    }
}
