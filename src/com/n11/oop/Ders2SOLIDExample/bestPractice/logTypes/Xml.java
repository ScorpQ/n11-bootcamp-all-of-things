package com.n11.oop.Ders2SOLIDExample.bestPractice.logTypes;

import com.n11.oop.Ders2SOLIDExample.bestPractice.Interfaces.ILog;

public class Xml implements ILog {
    @Override
    public boolean logKayit(String value) {
        System.out.println("Log tutuldu tip XML: " + value);
        return true;
    }
}
