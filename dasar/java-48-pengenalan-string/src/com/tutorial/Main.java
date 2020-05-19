package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //perbedaan antara char dan string adalah jika char menggunakan ''
        //kalau string menggunakan ""

        System.out.println("===Membuat String===");
        String kata = "hello world!!";
        char kata1[] ={'h','a','l','l','o'};

        System.out.println("\n ===Menampilkan String===");
        System.out.println(Arrays.toString(kata1));
        System.out.println(kata);

        System.out.println("\n===Mengakses Komponen String===");
        System.out.println("komponen pertama dari char = " +kata1[0]);
        System.out.println("komponen pertama dari char = " + kata.charAt(0));

        //merubah komponen string itu tidak bisa
        //karena komponen string di java itu immutable
        kata1[0] = 'c';
        System.out.println(Arrays.toString(kata1));
    }
}
