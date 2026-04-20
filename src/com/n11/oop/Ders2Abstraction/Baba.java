package com.n11.oop.Ders2Abstraction;

import com.n11.oop.Ders2Abstraction.Insan;
import com.n11.oop.Ders2Abstraction.Interfaces.IBahce;
import com.n11.oop.Ders2Abstraction.Interfaces.IMaket;

public class Baba extends Insan implements IMaket, IBahce {

    @Override
    public void tanitim() {
        System.out.println("Ben babayım.");
    }

    @Override
    public void maketYap() {
        System.out.print(" maket yapıyor.");

    }

    @Override
    public void bahceDuzenle() {
        System.out.print(" bahce duzenliyor.");
    }
}
