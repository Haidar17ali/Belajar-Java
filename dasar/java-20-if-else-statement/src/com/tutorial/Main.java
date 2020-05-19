package com.tutorial;

public class Main {

    public static void main(String[] args){

         //tutorial if statement atau percabangan
        int a = 7;

        if (a < 6){
            System.out.println("Anda tidak lulus");
        }else {
            System.out.println("Anda lulus");
        }

        System.out.println("Selesai");

        //if else if

        System.out.println("===IF ELSE IF===");
        if (a < 6){
            System.out.println("Anda tidak lulus");
        }else if (a == 7){
            System.out.println("Nilai anda pas rata-rata");
        }else {
            System.out.println("anda lulus");
        };

        //nested if

        System.out.println("===Nested IF===");

        if (a == 6){
            if (a > 8){
                System.out.println("iya betul");
            }else {
                System.out.println("salah ya");
            }
        }else {
            System.out.println("iya salah");
        }


    }

}
