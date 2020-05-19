package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Nilai Awal : ");
        int nilaiAwal = userInput.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        int nilaiAkhir = userInput.nextInt();
        int total = 0;
        for (nilaiAwal= nilaiAwal; nilaiAwal<=nilaiAkhir;nilaiAwal++){
            int hasil;
            total = total - 1 + nilaiAwal;

            System.out.println("total = " + total
            );



        }

//        while (nilaiAwal<=nilaiAkhir){
//            total +=nilaiAwal;
//            System.out.println(total);
//            nilaiAwal++;
//        }
//        do {
//            total += nilaiAwal;
//            System.out.println("total : " + total);
//            nilaiAwal++;
//        }while (nilaiAwal<=nilaiAkhir);
    }
}
