package com.tutorial;

//membuat class sbg template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {

    public static void main(String[] args) {

        // instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Haidar Ali";
        mahasiswa1.NIM = "118228062";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 35.5;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Sowi Abdul Aziz";
        mahasiswa2.NIM = "118228069";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 35.75;
        mahasiswa2.umur = 21;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.umur);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
    }

}