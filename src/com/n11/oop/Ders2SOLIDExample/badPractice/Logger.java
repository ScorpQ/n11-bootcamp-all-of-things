package com.n11.oop.Ders2SOLIDExample.badPractice;

import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.DbLog;
import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.LogType;
import com.n11.oop.Ders2SOLIDExample.badPractice.logTypes.XmlLog;

public class Logger {
    private DbLog dblog;
    private XmlLog xmllog;

    public Logger(XmlLog xmllog, DbLog dblog) {
        this.xmllog = xmllog;
        this.dblog = dblog;
    }

    public void logKayit (LogType logtype, String value) {

        switch (logtype) {
            case Xml:
                xmllog.xmlKayit(value);
                break;
            case Db:
                dblog.dbKayit(value);
                break;
        }
    }
}
