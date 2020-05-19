package com.tutorial;

public class Main {

    public static void main(String[] args){

        int a = 0;
        while (true){
            a++;

            if (a==10){
                break; //memaksa keluar dari loop
            }else if(a==5){
                continue;//melakukan skip/ keyword untuk memaksa memulai aksi dari awal
            }else if(a==7){
                return;//menyelesaikan eksekusi program
            }

            System.out.println("ini adalah nilai a ke-" + a);
        }
    }
}
