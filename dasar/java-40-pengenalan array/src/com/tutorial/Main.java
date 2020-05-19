package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        //array adalah kumpulan data primitif
        System.out.println("===Assignment Array===");
        int [] array = {1,2,3,4,5};
        System.out.println(array[2]);

        //deklarasi array
        float [] arraydek = new float[5];
        System.out.println("===Deklarasi Array===");

        arraydek[4] = 27.8f;

        System.out.println(arraydek[0]);
        System.out.println(arraydek[1]);
        System.out.println(arraydek[2]);
        System.out.println(arraydek[3]);
        System.out.println(arraydek[4]);

        System.out.println(Arrays.toString(array));

    }
}
