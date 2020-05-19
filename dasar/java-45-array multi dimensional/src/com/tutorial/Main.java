package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //array multi dimensi adalah array di dalam array

        //cara assignment
        System.out.println("\n===Assignment  Array===");
        int arraydimens[][] = {
                {1,2,3,4,5,6},
                {465}
        };
        printArray2D(arraydimens);
        System.out.println("\n===Deklarasi  Array===");
        //cara deklarasi
        int array2D[][] = new int[3][3];
        printArray2D(array2D);
        System.out.println("===for===");
        printColom(arraydimens);
        System.out.println("===foreach===");
        printColomForEach(arraydimens);


    }

    private static void printColomForEach(int dataarray[][]){
        for (int baris[]: dataarray){
            System.out.print("[");
            for (int colom: baris){
                System.out.print(colom +",");
            }
            System.out.println("]\n");
        }
    }

    private static void printColom(int array[][]){
        for (int i=0; i<array.length; i++){
            System.out.print("[");
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + ",");
            }
            System.out.println("]\n");
        }
    }

    private static void printArray2D(int array[][]){
        for (int i=0; i<array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
