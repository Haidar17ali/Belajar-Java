package com.tutorial;

class Mahasiswa {
    String nama;
    int NIM;
    String jurusan;

    Mahasiswa(String nama, int NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;// this artinya kita mnegambila nama classnya / sama dengan mahasiswa1.nama
        this.jurusan = jurusan;
    }

    // method tanpa return dan parameter
    void tampil() {
        System.out.println("Nama :" + this.nama);
        System.out.println("NIM :" + this.NIM);
        System.out.println("Jurusan :" + this.jurusan);
    }

    // method tanpa return dan dengan parameter
    // setter
    void ubah(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    // getter
    String getNama() {
        return this.nama;
    }

    int getNIM() {
        return this.NIM;
    }

    // method dengan return dan parameter
    String setGetnama(String nama) {
        return this.nama = nama;
    }
}

public class Main {

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Haidar Ali", 118228062, "Teknik Informatika");

        // method
        mahasiswa1.tampil();
        mahasiswa1.ubah("Sowi");
        mahasiswa1.tampil();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        System.out.println(mahasiswa1.setGetnama("Ekky"));
    }

}
