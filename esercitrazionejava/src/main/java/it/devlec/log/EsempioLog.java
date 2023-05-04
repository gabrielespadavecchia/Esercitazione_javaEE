package it.devlec.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsempioLog {
    private static final Logger logger =  LogManager.getLogger(EsempioLog.class);

    public EsempioLog(){

    }
    public void stampaAltriLog(){
        logger.info("Ciao da stampa altri log...");
        logger.warn("warning");
        logger.info("info");
        logger.trace("trace");
        logger.debug("debug");
        logger.error("error");
        logger.fatal("fatal");
    }
}
