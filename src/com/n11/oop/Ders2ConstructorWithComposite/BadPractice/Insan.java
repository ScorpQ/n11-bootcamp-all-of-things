package com.n11.oop.Ders2ConstructorWithComposite.BadPractice;

// Composite olmadan insanın biyolojik unsurlarını CTR kullanarak tanımlayalım.
public abstract class Insan {
    public String ad;
    public String soyad;
    public int yas;
    public double maas;
    public boolean cinsiyet;

    // Biyolojik kısımlar teker teker yazıldı ve composite class kullanılmadığı için çok karmaşık ve uzun gözüküyor.
    public String gözRengi;
    public String gözŞekli;
    public String burunSekli;
    public String burunBüyüklüğü;
    public String kulakSekli;
    public String kulakSayısı;


    void nefesAl() { System.out.println(this.ad + " nefes alıyor"); }
    void uyu() { System.out.println(this.ad + " uyuyor"); }

    public abstract void tanitim();
}
