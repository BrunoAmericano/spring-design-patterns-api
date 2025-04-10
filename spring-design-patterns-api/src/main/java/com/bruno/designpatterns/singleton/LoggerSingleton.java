
package com.bruno.designpatterns.singleton;

public class LoggerSingleton {

    private static LoggerSingleton instance;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
