package com.n11.oop.Ders1Inheritance;

// "extends  Ozellikler" kısmını ilk başta görmezden gel.
// son notlarda buraya değinip "interface" yapısına geçyiyoruz.
public class Insan extends  Ozellikler{
    public String ad;
    public String soyad;
    public int yas;
    public double maas;
    public boolean cinsiyet;

    public void uyu() {
        System.out.println("uyu");
    }

    public void ekranaYaz() {
        System.out.println("Kişinin adı: " + this.ad);
    }
}
