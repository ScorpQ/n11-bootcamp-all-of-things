package com.n11.oop.Ders1Interface;

// Imports
import com.n11.oop.Ders1Interface.Anne;
import com.n11.oop.Ders1Interface.Baba;
import com.n11.oop.Ders1Interface.Cocuk;
import com.n11.oop.Ders1Interface.CocukCesitleri.AkilliCocuk;
import com.n11.oop.Ders1Interface.CocukCesitleri.UsluCocuk;
import com.n11.oop.Ders1Interface.Insan;


public class Main {
    public static void main(String[] args) {


        // Az önce Ders1Inheritance'ın sonunda, classlarımızın özel özelliklere sahip olmasını istemiştik.
        // Bunu class ile yaptığımı zaman, encapslation methoduna aykırılık yani herkes her methoda erişebilir hale gelmişti
        // Şimdi ise interface'ler tanımlarıp bunları ilgili classlara implemente ediyoruz.

        // Baba maketyapsı ve bahcedüzenelsin - Anne softrahazırlasın ve temizlikyapsın - Çocuk is sadece derscalissin

        Baba baba2  = new Baba();
        Anne anne2 = new Anne();
        Cocuk cocuk2 = new Cocuk();

        // baba2.sofraHazirla/temizlikYap(); Kesinlikle hata atar çünkü 'sofraHazirla/temizlikYap'
        // interface'ini baba class'ına implemente ETMEDİK. Baba sadece 'bahceDuzenle ve maketYap'
        baba2.bahceDuzenle();
        baba2.maketYap();

        // anne2.bahceDuzenle/maketYap(); Kesinlikle hata atar çünkü 'bahceDuzenle/maketYap'
        // interface'ini anne class'ına implemente ETMEDİK. Anne sadece 'sofraHazirla ve temizlikYap'
        anne2.sofraHazirla();
        anne2.temizlikYap();

        // cocuk2.sofraHazirla/temizlikYap(); Kesinlikle hata atar çünkü 'sofraHazirla/temizlikYap'
        // interface'ini cocuk class'ına implemente etmedik. Cocuk sadece 'dersCalis'
        cocuk2.dersCalis();

        // Interface'i kafamızda fazla büyütmeyelim....
    }
}