package com.n11.oop.Ders2SOLIDExample.bestPractice;

import com.n11.oop.Ders2SOLIDExample.bestPractice.Logger;
import com.n11.oop.Ders2SOLIDExample.bestPractice.logTypes.Db;
import com.n11.oop.Ders2SOLIDExample.bestPractice.logTypes.Xml;

public class Main {
    public static void main(String[] args) {

        // Loosly coupled design ile alakalı bir çözümdür bu.
        // Araya bir interface ekleyerek CTR Hell'den kaçarız.
        Xml Xml = new Xml();
        Db Db = new Db();

        Logger XmlLogger = new Logger(Xml);
        Logger DbLogger = new Logger(Db);

        DbLogger.logYaz("Ben DB logger'ım.");
        XmlLogger.logYaz("Ben XML logger'ım.");
    }
}
