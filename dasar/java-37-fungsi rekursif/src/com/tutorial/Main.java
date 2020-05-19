package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){
        //fungsi rekursif adalah fungsi yang dapat dipanggil berulang ulang seperti looping

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai : " + nilai);
        int hasil =print(nilai);
        System.out.println("Hasil : "+ hasil);

        int hasil1 = faktorial(nilai);
        System.out.println("Hasilnya : " + hasil1);
    }

    private static int faktorial(int parameter){

        System.out.println("Nilai = " + parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * faktorial(parameter - 1);

    }

    private static int print(int parameter){

        System.out.println("Nilai = " + parameter);
        if (parameter == 0){
            return parameter;
        }

        return parameter + print(parameter-1);

    }
}
