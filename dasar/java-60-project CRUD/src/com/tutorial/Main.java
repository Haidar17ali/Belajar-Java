package com.tutorial;

//import java library
import java.io.*;
import java.util.Scanner;

//import crud library
import crud.Operasi;
import crud.Utility;
import crud.Operasi.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;

        boolean isLanjutkan = true;
        while (isLanjutkan) {
            Utility.clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n==============");
                    System.out.println("CARI DATA BUKU");
                    System.out.println("==============");
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    Operasi.editData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    Operasi.hapusData();
                    break;
                default:
                    System.err.println("\nPilihan tidak ada!!\nSilahkan pilih 1 sampai 5");

            }
            isLanjutkan = Utility.getYOrN("Apakah anda ingin melanjutkan");
        }

    }

}


















