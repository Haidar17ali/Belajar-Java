package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        int hasilInteger = tambah(10,5);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(10.5f, 11);
        printAngka(hasilFloat);

        printAngka(19);
        printAngka(19.5f);
    }

    private static float tambah(float a, float b){
        return a + b;
    }

    private static int tambah(int a, int b){
        return a + b;
    }

    public static void printAngka(float nilaiFloat){
        System.out.println("ini adalah nilai float ke-"+ nilaiFloat);
    }

    public static void printAngka(int nilaiInteger){
        System.out.println("ini adalah nilai integer ke-"+ nilaiInteger);
    }

}
