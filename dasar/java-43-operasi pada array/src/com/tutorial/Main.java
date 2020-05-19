package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        int angkaarray1[]= {1,2,3,4,5};
        //merubah arrayke string
        System.out.println("\nMerubah array menjadi string\n ===");
        printArray(angkaarray1);
        //me copy array ke string
        System.out.println("\nMengcopy array menjadi string\n ===");
        int angkaArray2[] = new int[5];
        printArray(angkaarray1);
        printArray(angkaArray2);

        System.out.println("\n===mengcopy===");
        for(int i = 0; i<angkaarray1.length;i++){
            angkaArray2[i] = angkaarray1[i];
        }
        printArray(angkaarray1);
        System.out.println("address array1 " + angkaarray1);
        printArray(angkaArray2);
        System.out.println("Address array2 " +  angkaArray2);

        System.out.println("\n===Mengcopy dengan copyof===");
        int angkaArray3[] = Arrays.copyOf(angkaarray1,5);
        printArray(angkaarray1);
        printArray(angkaArray3);

        System.out.println("\n===Mencopy dengan copyOfRange===");
        int  angkaArray4[] = Arrays.copyOfRange(angkaarray1,2,5);
        printArray(angkaarray1);
        printArray(angkaArray4);

        //fill array
        System.out.println("===\nFill Array\n===");
        int angkaArray5[] =new int[10];
        System.out.println("sebelum di isi");
        printArray(angkaArray5);
        System.out.println("sesudah di isi");
        Arrays.fill(angkaArray5,17);
        printArray(angkaArray5);

        //komparasi array
        System.out.println("===\nKomparasi Array\n===");
        int angkaArray6[] = {1,2,3,4,5};
        int angkaArray7[] = {1,21,3,4,5};

        System.out.println("\n===membandingkan 2 array===");
        //gagal jika menggunakan ==
        if (Arrays.equals(angkaArray6,angkaArray7)){
            System.out.println("Array ini sama");
        }else {
            System.out.println("Array ini Beda");
        }

        //harus menggunakan Array.equals() dan hasilnya adalah boolean
        System.out.println(Arrays.equals(angkaArray6,angkaArray7));

        //membandingkan array mana yg lebih besar
        System.out.println("\n===mengecek array yang lebih besar===");
        System.out.println(Arrays.compare(angkaArray6,angkaArray7));

        System.out.println("\n===mengecek index yang berbeda===");
        System.out.println(Arrays.mismatch(angkaArray6,angkaArray7));

        //sort array
        System.out.println("===\nSort Array\n===");
        int angkaArray8[] =  {1,32,34,3,2,32,1,5};
        int angkaArray9[] =  {12,21,14,2,1,2,2,6};
        printArray(angkaArray8);
        Arrays.sort(angkaArray8);
        printArray(angkaArray8);

        //search array
        System.out.println("===\nSearch Array\n===");

        printArray(angkaArray8);
        int angka = 32;
        //kekurangan binary search adalah kita harus sortingterlebih dahulu
        int posisi = Arrays.binarySearch(angkaArray8,angka);
        System.out.println("Angka " + angka + " Berada di index ke-" + posisi);

        //menjumlahkan array
        int hasil[] = new int[8];
        for (int j = 0; j < angkaArray8.length;j++){
            hasil[j] = angkaArray8[j] + angkaArray9[j];
        }
        printArray(hasil);

    }
    private static void printArray(int dataArray[]){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
