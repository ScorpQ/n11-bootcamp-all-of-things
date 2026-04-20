package com.n11.oop.Ders1Interface;

import com.n11.oop.Ders1Interface.Interfaces.IBahce;
import com.n11.oop.Ders1Interface.Interfaces.ITemizlik;
import com.n11.oop.Ders1Interface.Interfaces.IMaket;


// Baba sadece maketyapmalı ve bahcedüzenlemli, interface sayesinde sadece bu methodları implemente ettik.
// Ayrıca eğer implemente etmezsek kesinlikle hata alırız. Hataları engelemek için override ederek sözleşmedeki
// methodları kesinlikle eklemek zorundayız.
public class Baba extends Insan implements IMaket, IBahce {
    @Override
    public void maketYap() {
        System.out.print(" dinliyor.");

    }

    @Override
    public void bahceDuzenle() {
        System.out.print(" okuyor.");
    }
}
