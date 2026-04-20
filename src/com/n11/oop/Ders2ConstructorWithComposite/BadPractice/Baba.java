package com.n11.oop.Ders2ConstructorWithComposite.BadPractice;


public class Baba extends Insan {

    // Biyolojik kısımlar teker teker yazıldı ve composite class kullanılmadığı için çok karmaşık ve uzun gözüküyor.
    public Baba(
            String gözRengi,
            String gözŞekli,
            String burunSekli,
            String burunBüyüklüğü,
            String kulakSekli,
            String kulakSayısı) {
        this.gözRengi = gözRengi;
        this.gözŞekli = gözŞekli;
        this.burunSekli = burunSekli;
        this.burunBüyüklüğü = burunBüyüklüğü;
        this.kulakSekli = kulakSekli;
        this.kulakSayısı = kulakSayısı;

    }


    @Override
    public void tanitim() {
        System.out.println("Ben babayım.");
    }


}
