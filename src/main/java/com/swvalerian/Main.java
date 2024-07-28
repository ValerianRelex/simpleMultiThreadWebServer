package com.swvalerian;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    static {
        try {
            Handler handler = new FileHandler("log.txt");
            handler.setLevel(Level.ALL);
            LOGGER.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        LOGGER.setLevel(Level.ALL);
        LOGGER.info("\n\n Hello world! \n\n");
    }
}