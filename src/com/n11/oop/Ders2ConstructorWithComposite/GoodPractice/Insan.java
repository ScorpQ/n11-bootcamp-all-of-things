package com.n11.oop.Ders2ConstructorWithComposite.GoodPractice;


import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Burun;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Goz;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Kulak;

// Composite kullanarak insanın biyolojik unsurlarını ile beraber CTR kullanarak tanımlayalım.
public abstract class Insan {
    public String ad;
    public String soyad;
    public int yas;
    public double maas;
    public boolean cinsiyet;


    // İŞte composite ile daha kısaltttık daha derli toplu oldu.
    public Burun burun;
    public Goz goz;
    public Kulak kulak;

    public Insan (Burun burun, Goz goz,  Kulak kulak) {
        this.burun = burun;
        this.goz = goz;
        this.kulak = kulak;
    }


    void nefesAl() { System.out.println(this.ad + " nefes alıyor"); }
    void uyu() { System.out.println(this.ad + " uyuyor"); }

    public abstract void tanitim();
}
