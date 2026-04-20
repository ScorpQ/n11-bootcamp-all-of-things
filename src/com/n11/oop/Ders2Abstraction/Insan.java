package com.n11.oop.Ders2Abstraction;

// Artık bu class'ın abstract olduğunu fark etmişsindir ve readme.txt'de detaylı yazdım
// Burada nesnelerin ortak özelliklerini barındıran field/method'lar belirtilir tanımlanır.
// uyuma  faaliyeti herkeste aynıdır bu yüzden ortak gövdeli bir method yazdım
// tanıtım ise yine ortak bir faaliyet ama oluşturulan objeye özeldir. Bu yüzden gövdesini ilgili class'Ta tanımlayacağız.

// Interface ile farkını hisset.
// Birisi yapabileceğimiz özellikleri tanımlamak için kullanılırken,
// Bir diğeri ise ortak özellikleri tanımlamak için kullanılır.
// Ayrıca interface multiple implement edilebilirken bir başka class'a
// Classlar sadece bir kez extend edilebilir bir başka class'a

// Son olarak abstract class içerisine illa sadece gövdesiz methodlar yazmak zorunda değiliz.
// Ortak olduğunu ve class'lara özgü olmadığını düşündüğümüz özellikleri doğrudan içeriye yazabiliriz.
// nefes almak ve uyumak gibi... BKNZ 27. SATIR VE 28. SATIR

public abstract class Insan {
    public String ad;
    public String soyad;
    public int yas;
    public double maas;
    public boolean cinsiyet;


    // Herkes nefes alır, uyur == ortak davranış
    void nefesAl() { System.out.println(this.ad + " nefes alıyor"); }
    void uyu() { System.out.println(this.ad + " uyuyor"); }

    // Herkesin kendine özgü tanıtımı var  == gövdesiz
    public abstract void tanitim();
}
