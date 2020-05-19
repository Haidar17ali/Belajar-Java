package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // a operator dan b
        float a,b;
        char operator;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Nilai a : ");
        a = inputuser.nextFloat();
        System.out.print("Operator : ");
        operator = inputuser.next().charAt(0);
        System.out.print("Nilai b : ");
        b = inputuser.nextFloat();

        System.out.println("Input user : " + a + " " + operator + " " + b);

        //operator yang ada
        if (operator == '+'){
            System.out.println(a + b);
        }else if (operator == '-'){
            System.out.println(a - b);
        }else if (operator == '*'){
            System.out.println(a * b);
        }else if (operator == '/'){
            if (b == 0){
                System.out.println("pembagian 0 hasilnya tak terhingga");
            }else {
                System.out.println(a / b);
            }
        }else {
            System.out.println("Operator tidak di temukan ");
        }

    }
}
