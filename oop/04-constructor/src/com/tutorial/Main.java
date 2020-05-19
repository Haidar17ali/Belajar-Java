package com.tutorial;

// class tanpa constructor
class Mahasiswa {
    String nama;
    int NIM;
}

// class dengan constructor
class Pegawai {
    String nama;
    String NIP;
    int umur;

    // constructor dipanggil saat obj pertama kali dibuat
    // Pegawai() {
    // System.out.println("Ini adalah Constructor");
    // }

    // constructor dengan parameter
    Pegawai(String nama, String NIP, int umur) {
        nama = nama;
        NIP = NIP;
        umur = umur;
        System.out.println(nama);
        System.out.println(NIP);
        System.out.println(umur);
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        Pegawai pegawai1 = new Pegawai("Haidar Ali", "118228062", 20);

        // Mahasiswa mahasiswa1 = new Mahasiswa();
        // mahasiswa1.nama = "Haidar Ali";
        // mahasiswa1.NIM = 118228062;

        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa1.NIM);

    }

}