package tugas.latihan;

import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        int sisi;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        sisi = userInput.nextInt();
        getSisi(sisi);
        luasPersegi(sisi);

    }

    private static void getSisi(int sisi){
        System.out.println("Sisi persegi tersebut adalah " + sisi);
    }
    private static int luasPersegi(int sisi){
        int luas;
        luas = sisi * sisi;
        System.out.println("Luas persegi tersebut adalah "+ luas);
        return luas;
    }
}
