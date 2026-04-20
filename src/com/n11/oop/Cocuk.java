/*
// CANSIN LALE  -----
interface ILog {

    boolean kayit(String deger);

}

class XmlLog implements ILog {

    public boolean kayit(String deger) {

        System.out.println(deger + " xml e kaydedildi.");

        return true;

    }

}

class DbLog implements ILog {

    public boolean kayit(String deger) {

        System.out.println(deger + " db ye kaydedildi.");

        return true;

    }

}

class TextLog implements ILog {

    public boolean kayit(String deger) {

        System.out.println(deger + " text e kaydedildi.");

        return true;

    }

}

class Logger {

    private List<ILog> loggers;

    public Logger(List<ILog> loggers) {

        this.loggers = loggers;

    }

    public void logKayit(String deger) {

        for (ILog log : loggers) {

            log.kayit(deger);

        }

    }

}

class Main {

    public static void main(String[] args) {

        List<ILog> loggers = new ArrayList<>();

        loggers.add(new XmlLog());

        loggers.add(new DbLog());

        loggers.add(new TextLog());

        Logger logger = new Logger(loggers);

        logger.logKayit("kayıt tutuldu");

    }

}

// -----------
*/