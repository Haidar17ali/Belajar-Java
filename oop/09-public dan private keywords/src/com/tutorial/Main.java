package com.tutorial;

class Player {
    String nama;// default : bisa dibaca dan ditulis
    public int exp;// public : sama dengan default/ dapat diakses dari luar classnya
    private int health;// private : hanya bisa di baca dan di tulis di dalam class

    Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }

    // def modifier access
    void display() {
        tambahExp();// contoh mengakses private method
        System.out.println("\nNama : " + this.nama);
        System.out.println("Experience : " + this.exp);
        System.out.println("Health : " + this.health);// membaca tapi didalam class
    }

    // public
    public void setname(String newName) {
        this.nama = newName;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {

    public static void main(String[] args) {
        Player paidi = new Player("Paidai sang pembunuh", 0, 100);
        System.out.println(paidi.nama);// membaca data
        paidi.nama = "\nPaidi sang penakluk";// menulisdata
        System.out.println(paidi.nama);

        // public
        System.out.println(paidi.exp);// membaca data
        paidi.exp = 5;// menulisdata
        System.out.println(paidi.exp);

        // private(tidak bisa di akses)
        // System.out.println(paidi.health);// membaca data
        // paidi.health = 5;// menulisdata
        // System.out.println(paidi.health);

        // method

        // default
        paidi.display();

        // public
        paidi.setname("Cak Doel Mandoel");
        paidi.display();

        // private(tidak bisa di akses dari luar)
        // paidi.tambahExp();

    }

}
