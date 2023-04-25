package org.battleship.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Settings settings = new Settings();
        logger.info("Server starts running...");
        logger.info("Starting application v" + settings.getProgramVersion());
        long counter = 0;
        for (;;) {
            try {
                Thread.sleep(1000);
                logger.info("Server running for " + String.valueOf(++counter) + " seconds");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}