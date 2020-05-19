package com.terminal;

public class Console {

    // visibility public bisa terlihat dimana saja
    public static void log(String message) {

        System.out.println(message);

    }

}

// hanya bisa diakses oleh console atau yang berada pada satu package
class Terminal {
    public static void log(String message) {

        System.out.println(message);

    }
}