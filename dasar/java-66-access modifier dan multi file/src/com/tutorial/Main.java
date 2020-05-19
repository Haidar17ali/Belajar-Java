package com.tutorial;

import kelasterbuka.util.Memasak;

public class Main {

    public static void main(String[] args) {
        //public, private, default, protected

        //dengan access modifier public, yang dapat di akses
        Lain.methodPublic();
        //dengan access modifier private, yang tidak dapat di akses
        //Lain:methodPrivate

        //karena dalam package yang sama maka dapat diakses
        Lain.methodDef();

        //karena dalam package yang sama maka dapat diakses
        Lain.methodProtected();

        Memasak.dagingPublic();

    }

}
