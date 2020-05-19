package com.tutorial;

public class Main {

    public static void main(String[] args){
        int y;
        y = hitung(10);

        System.out.println("Y = " + y);

    }

    static int hitung(int input){

        int hasil;
        hasil = (input+2)*input;
        return hasil;

    }

}
