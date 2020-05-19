package com.tutorial;

public class Main {

    public static void main(String[] args){

        //void adalah tipedata kosong / hampa jadi kita tidak memerluka return lagi
        fungsiSimpel("Float yang berada di fungsi simpel bernilai");
        System.out.println(simpel());
        selamatPagi("Haidar Ali");

    }

    //fungsi atau method tanpa kembalian
    //biasanya digunakan untuk sebuah fungsi
    //atau method yang melakukan sebuah kegiatan saja
    private static void fungsiSimpel(String input){
        System.out.println(input);
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat Pagi " + nama);
    }


    //fungsi atau method dengan kembalian
    //sehingga menggunakan return
    //untuk mengembalikan nilainya
    private static float simpel(){
        return 10.5f;
    }
}
