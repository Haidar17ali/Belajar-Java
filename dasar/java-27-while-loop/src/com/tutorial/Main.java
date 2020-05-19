package com.tutorial;

public class Main {

    public static void main(String[] args){

        int i = 1;
        boolean kondisi = true;
        while (kondisi){
            System.out.println("sekarang i bernialai :" + i);

            if (i >=10){
                kondisi = false;
            }
            i++;
        }

    }

}
