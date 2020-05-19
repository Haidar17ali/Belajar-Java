package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[]  args){
        int  array[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        //looping standard
        System.out.println("===looping standard===");
        for (int i = 0;i<5;i++){
            System.out.println("ini adalah nilai ke-" + i + "dan array nya = " + array[i]);
        }
        System.out.println("===looping dengan properties===");
        //looping dengan properti array
        for (int i  = 0;i <array.length; i++){
            System.out.println("ini adalah nilai ke " + i + "dan array = " + array[i]);
        }

        //looping khususon untuk collection -> array
        System.out.println("===foreach===");
        for (int angka: array) {
            System.out.println(angka
            );
        }
    }
}
