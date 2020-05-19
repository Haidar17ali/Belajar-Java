package com.company;

public class Main {

    public static void main(String[] args) {

        //operator komparasi akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;
        System.out.println("===== PERSAMAAN =====");
        //operator equal / persamaan
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);

        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        System.out.println("===== PERTIDAKSAMAAN =====");
        //operator not equal / pertidaksamaan
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);

        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        System.out.println("===== KURANG DARI =====");
        //operator less than / KURANG DARI
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        a = 7;
        b = 10;
        hasilKomparasi = (a < b);

        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        System.out.println("===== LEBIH DARI =====");
        //operator less than / LEBIH DARI
        a = 11;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        a = 7;
        b = 10;
        hasilKomparasi = (a > b);

        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        System.out.println("===== KURANG DARI SAMA DENGAN =====");
        //operator less than / KURANG DARI SAMA DENGAN
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        a = 7;
        b = 10;
        hasilKomparasi = (a <= b);

        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        System.out.println("===== LEBIH DARI SAMA DENGAN =====");
        //operator less than / LEBIH DARI SAMA DENGAN
        a = 11;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);

        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);


    }
}
