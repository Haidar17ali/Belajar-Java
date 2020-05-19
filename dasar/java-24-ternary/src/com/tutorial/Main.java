package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

         //ternary berfungsi mempersingkat if statement
        //var x = expresi ? stattrue : stateFalse

        int input, x;
        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        input = inputuser.nextInt();

        x = (input == 10 ) ? input*input : input/4;
        System.out.println(x);

    }
}
