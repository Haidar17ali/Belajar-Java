package com.tutorial;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);

        System.out.println("===MENGHITUNG LUAS PERSEGI PANJANG===");
        int panjang,lebar,luas,tinggi,volume;
        //membuat program perhitungan luas persegi panjang
        //luas = p x l

        System.out.print("Panjang Persegi = ");
        panjang = user_input.nextInt();
        System.out.print("Lebar Persgi = ");
        lebar = user_input.nextInt();

        luas =  panjang*lebar;
        System.out.printf("Luas = %d * %d = %d \n", panjang,lebar,luas );

        System.out.println("===Menghitung Volume===");
        System.out.print("Tinggi Persgi = ");
        tinggi = user_input.nextInt();
        volume = luas * tinggi;
        System.out.printf("Volume = %d * %d = %d \n", luas,tinggi,volume);

    }

}
