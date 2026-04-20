package com.n11.oop.Ders2SOLIDExample.badPractice;

import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.DbLog;
import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.LogType;
import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.XmlLog;

public class Main {

    public static void main(String[] args) {

        XmlLog xmlLog = new XmlLog();
        DbLog dbLog = new DbLog();
        Logger logger = new Logger(xmlLog, dbLog);
        logger.logKayit(LogType.Xml, "303 nolu hata kodu oluştu");

    }
}
