package com.tutorial;

import java.util.*;
import java.lang.String;


public class Main {

    public static void main(String[] args) {

        String kalimat = "SAYA SIAPA?";

        //mengambil komponen
        System.out.println(kalimat.charAt(3));
        //substring
        String kata = kalimat.substring(2,6);
        System.out.println(kata);
        //concatenation(concat)
        String kalimat2 = kalimat + " Kamu Ali";
        System.out.println(kalimat2);

        kata = kata + "ai";
        System.out.println(kata);

        //concat dengan non string
        int angka = 10;
        String kalimat3 = kalimat + " Ali ke-" + angka;//casting int akan diubah jadi str
        System.out.println(kalimat3);

        //lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        //replace
        String kalimat4 = kalimat.replace("SAYA","kamu");
        System.out.println(kalimat4);

        //compare
        String mobil1 = "Gallardo";
        String mobil2 = "Mustang";
        System.out.println(mobil1.compareTo(mobil2));
        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));

        //equality
        String test = "test";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Mengambil input user");
        String kataInput = userInput.next();
        System.out.println("Ini adalah input user: " + kataInput);
        if (kataInput.equals(test)){
            System.out.println("iya kata ini sama");
        }else {
            System.out.println("tidak kata ini tidak sama");
        }


    }
}
