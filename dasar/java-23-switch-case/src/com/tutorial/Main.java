package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //ekspresinya berupa satuan (int,long,short,byte), string

        String input;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Ketikkan nama :");
        input = userInput.next();
        System.out.println(input);

        switch (input){
            case "muhaimin":
                System.out.println("nama saya muhaimin bin hanib");
                break;
            case "samsul":
                System.out.println("samsul bin soleh hadir");
                break;
            default:
                System.out.println("nama tidak ada di kelas bos");
        }

    }


}
