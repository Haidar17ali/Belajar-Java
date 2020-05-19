package com.tutorial;

import java.util.*;
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        print(builder);
        int addressBuilder = System.identityHashCode(builder);
        System.out.println("Address = " + Integer.toHexString(addressBuilder));

        //append
        builder.append(" dunia");
        print(builder);

        builder.append(" Siap bergoyang");
        print(builder);

        //inset
        builder.insert(10, " saya siapa?");
        print(builder);

        //delete
        builder.delete(5,11);
        print(builder);

        //rubah char pada index tertentu
        builder.setCharAt(5,'D');
        print(builder);

        //replace
        builder.replace(5,9,"kamu");
        print(builder);

        //merubah ke str
        String kalimat = builder.toString();
        int adres = System.identityHashCode(kalimat);
        System.out.println("Address : " + Integer.toHexString(adres));
        System.out.println(kalimat);

    }

    private static void print(StringBuilder builder){



        System.out.println("Kapasitas = " + builder.length());
        System.out.println("Kapasitas = " + builder.capacity());

        System.out.println(builder);
    }
}
