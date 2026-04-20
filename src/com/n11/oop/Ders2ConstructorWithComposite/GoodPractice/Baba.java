package com.n11.oop.Ders2ConstructorWithComposite.GoodPractice;

import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Burun;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Goz;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Kulak;

// Composite class'lar sayesinde 6 String yerine 3 anlamlı nesne alıyoruz.
public class Baba extends Insan {

    public Goz goz;
    public Burun burun;
    public Kulak kulak;

    public Baba(Goz goz, Burun burun, Kulak kulak) {
        super(burun, goz, kulak);
        this.goz = goz;
        this.burun = burun;
        this.kulak = kulak;
    }

    @Override
    public void tanitim() {
        System.out.println("Ben babayım.");
    }
}
