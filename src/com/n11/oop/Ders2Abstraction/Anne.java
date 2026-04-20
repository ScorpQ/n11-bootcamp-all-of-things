package com.n11.oop.Ders2Abstraction;

import com.n11.oop.Ders2Abstraction.Interfaces.ISofra;
import com.n11.oop.Ders2Abstraction.Interfaces.ITemizlik;


public class Anne extends Insan implements ITemizlik, ISofra {

    @Override
    public void tanitim() {
        System.out.println("Ben anneyim.");
    }

    @Override
    public void temizlikYap() {
        System.out.print(" temizlik yapıyor.");
    }

    @Override
    public void sofraHazirla() {
        System.out.print(" sofra hazirliyor.");
    }
}
