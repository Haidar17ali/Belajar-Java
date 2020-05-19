package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader buffinput = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(buffinput);

        //ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext());//true

//        untuk membaca kata, dengan kata pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext());//false

        //menggunakan delimeter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        buffinput = new BufferedReader(fileInput2);
        buffinput.mark(200);

        scanner = new Scanner(buffinput);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        //menggunakan string tokenizer
        buffinput.reset();
        String data = buffinput.readLine();
        System.out.println(data);

        StringTokenizer stringtoken = new StringTokenizer(data,",");

        while (stringtoken.hasMoreTokens()){
            System.out.println(stringtoken.nextToken());
        }
        data = buffinput.readLine();
        System.out.println(data);

        stringtoken = new StringTokenizer(data,",");

        while (stringtoken.hasMoreTokens()){
            System.out.println(stringtoken.nextToken());
        }

    }
}











