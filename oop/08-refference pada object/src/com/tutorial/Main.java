package com.tutorial;

class Buku {
    String judul, penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("\nPenulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku onePiece = new Buku("One Piece", "Eichiro Oda");
        onePiece.display();

        // menampilkan address
        String adresbuku = Integer.toHexString(System.identityHashCode(onePiece));
        System.out.println(adresbuku);

        // assignment objek
        Buku buku2 = onePiece;
        buku2.display();
        String adresbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(adresbuku2);

        // memasukkan obj dalam method
        fungsi(buku2);
        buku2.display();
        onePiece.display();
    }

    public static void fungsi(Buku databuku) {
        String adresdataBuku = Integer.toHexString(System.identityHashCode(databuku));
        System.out.println("Address dalam fungsi : " + adresdataBuku);
        databuku.penulis = "said";
    }
}
