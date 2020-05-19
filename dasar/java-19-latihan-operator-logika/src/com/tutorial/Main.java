package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //membuat objk untuk input dari user
        Scanner userInput =  new Scanner(System.in);

        //membuat program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda = ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("Nilai tebakan Anda adalah "+ nilaiTebakan);

        //operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda = " + statusTebakan);

        //operasi aljabar boolean (and / or)
        System.out.print("Masukkan nilai antara 4 dan 9 = ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda = " + statusTebakan);

    }

}
