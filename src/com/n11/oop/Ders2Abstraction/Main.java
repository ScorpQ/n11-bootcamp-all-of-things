package com.n11.oop.Ders2Abstraction;

// Imports

public class Main {
    public static void main(String[] args) {
        // Az önce Ders1Interface'in sonunda, classlarımızın özel özelliklere sahip olmasını istemiştik.
        // Claslara özel özellik dediğimiz zaman aklımıza birazcık abstract class'lar da gelmeli.
        // Detaylarını ilgili class'ların içerisinde açıkladım.
        Baba baba2  = new Baba();
        Anne anne2 = new Anne();
        Cocuk cocuk2 = new Cocuk();

        // Aşağıda interface'den farklı olarak, gerçekten de hepsi için ortak olan özellikleri
        // (çzellikten kasıt burada = Method/field) tanımladık. Hepsi için de kullanabiliriz.
        baba2.uyu();
        baba2.nefesAl();
        baba2.tanitim();

        anne2.uyu();
        anne2.nefesAl();
        anne2.tanitim();

        cocuk2.uyu();
        cocuk2.nefesAl();
        cocuk2.tanitim();

/*
        --  Interface ile Abstract farkı   --
        Akademi Örneği:

        Araştırma Görevlisi, Öğretim Görevlisi, Rektör → hepsi AkademiUyesi'dir (abstract class)
        Öğretim Görevlisi, Rektör → ders verebilir (interface)
        Araştırma Görevlisi → ders veremez, interface implemente edilmedi
        Önemli Kural:
        Abstract class'a koyduğun her şey tüm alt sınıflarda anlamlı olmalı. Değilse interface'e taşı.
 */
    }
}