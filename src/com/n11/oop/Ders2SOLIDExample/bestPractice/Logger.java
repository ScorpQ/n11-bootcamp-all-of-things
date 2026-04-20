package com.n11.oop.Ders2SOLIDExample.bestPractice;

import com.n11.oop.Ders2SOLIDExample.bestPractice.Interfaces.ILog;

public class Logger {

    public ILog logger;

    public Logger(ILog logger ) {
        this.logger = logger;
    }

    public void logYaz(String value) {
        logger.logKayit(value);
    }
}
