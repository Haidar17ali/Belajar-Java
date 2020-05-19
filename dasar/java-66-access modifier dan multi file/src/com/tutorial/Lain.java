package com.tutorial;

public class Lain {


    //bagian ini dapat diakses oleh siapa saja
    public static void methodPublic(){
        System.out.println("Lain : Public");
    }
    //ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Private");
    }
    //ini hanya dapat diakses oleh class di package yang sama
    static void methodDef(){
        System.out.println("default");
    }
    //ini hanya dapat diakses oleh class dalam package yang sma dan subclassnya
    protected static void methodProtected(){
        System.out.println("Protected");
    }
}
