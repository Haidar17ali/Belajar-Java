package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int panjang;
        int lebar;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Panjang : ");
        panjang = inputUser.nextInt();
        System.out.print("Lebar : ");
        lebar = inputUser.nextInt();
        persegiPanjang(panjang,lebar);


        lebarPersegi(panjang,lebar);

    }

    private static void persegiPanjang(int panjang, int lebar){
        for (int i = 0;  i<lebar; i++){
            for (int j = 0; j<panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");

        }

    }

    private static int lebarPersegi(int panjang, int lebar){

        int hasil;
        hasil  = panjang * lebar;

        System.out.println("Lebar Persegi Panjang Tersebut Adalah " + hasil);
        return hasil;

    }

}
