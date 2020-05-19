package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int arrayAngka1[] = {1,3,5,3,6,2};
        int arrayAngka2[] = {12,9,1,2,5,3};
        //menambahkan array
        System.out.println("\nPenjumlahan Array");
        int hasil[] = aritmatika(arrayAngka1,arrayAngka2);
        print(hasil);

        //menggabungkan array
        System.out.println("\ngabungkan array");
        int gabungan[] = new int[arrayAngka1.length + arrayAngka2.length];
        for (int j = 0 ; j < arrayAngka1.length ; j++){
            gabungan[j] = arrayAngka1[j];
        }

        print(gabungan);
        for (int i = 0; i< arrayAngka2.length; i++){
            gabungan[i+arrayAngka1.length] = arrayAngka2[i];
        }
        print(gabungan);

        System.out.println("\nsort");
        //sort reverse
        reverse(arrayAngka2);
        print(arrayAngka2);
        reverse2(arrayAngka1);
        print(arrayAngka1);



    }

    private static void reverse2(int daraArray[]){
        Arrays.sort(daraArray);
        int reverse;
        for (int i = 0; i<daraArray.length/2; i++){
            reverse = daraArray[i];
            daraArray[i] = daraArray[(daraArray.length - 1) - i];
            daraArray[(daraArray.length - 1) - i] = reverse;
        }
    }

    private static void reverse(int dataArray[]){
        Arrays.sort(dataArray);
        int arrayRevesed[] = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0 ; i< dataArray.length; i++){
            dataArray[i] = arrayRevesed[(arrayRevesed.length - 1) - i];

        }
    }

    private static int[] aritmatika(int angkaInt1[], int angkaInt2[]){
        int hasil[] =new int[angkaInt1.length];
        for (int i = 0; i < angkaInt1.length; i++){
            hasil[i] = angkaInt1[i] + angkaInt2[i];
        }
        return hasil;
    }

    private static void print(int dataArray[]){
        System.out.println("Array =" + Arrays.toString(dataArray) );
    }

}
