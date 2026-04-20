package com.n11.oop.Ders1Interface;

// Ders1Inheritance'yi incelersen burada "extend Ozellikler" kodunu görmen lazım
// Neden burada olmadığını Ders1Interface kısmını inceleyerek anlayabilirsin.
public class Insan {
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
