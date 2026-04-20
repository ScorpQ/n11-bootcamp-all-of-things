Abstraction, class'ların ortak özelliklerinin tek bir noktada toplanmasıdır.
Bu classlardan doğrudan obje oluşturmayız, extend ederiz.

Peki Interface ile Abtraction farkı nedir?
    - Aslında ikisini de kullanarak aynı işi yapabiliriz, fakat bazı durumlarda bu mümkün değildir.
    Interface ile class'lara spesifik özellikleri implemente edebilirken
    Abtraction ile class'lara ortak özellik extend ederiz.

    Aslında fark çok basit:
        - Anne konuşabilir.
        - Baba konuşabilir.
        - Çocuk konuşabilir.
        konuşma özelliği tüm class'larda ortak olduğu için burada abstract class kullanmalıyız.


        - Anne sadece sofrahazırlar, temizlikyapar.
        - Baba sadece maketyapar,bahcedüzenler .
        - Cocuk sadece derscalısır.
        ders-maket-sofra-... sadece bazı classlara özel olduğu için interface kullanılır.

    INTERFACE = CAN X DO?
    ABSTRACTION = IS A X?
    bu soruları da sorabiliriz.