package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        //membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader buffRead = new BufferedReader(fileInput);
        buffRead.mark(200);

        //membaca kedalam string
        String data = buffRead.readLine();
        System.out.println(data);
        //membaca ke dalam char
        buffRead.reset();
        char datachar[] = new char[24];
        buffRead.read(datachar,0,24);
        System.out.println(Arrays.toString(datachar));

        //membaca baris
        buffRead.reset();
        System.out.println(buffRead.readLine());
        System.out.println(buffRead.readLine());

        //menulis
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferWriter = new BufferedWriter(fileOutput);

        buffRead.reset();
        String baris1 = buffRead.readLine();

        bufferWriter.write(baris1,0,baris1.length());
        bufferWriter.flush();

        //menambah new line atau enter
        bufferWriter.newLine();

        String baris2 = buffRead.readLine();
        bufferWriter.write(baris2,0,baris2.length());
        bufferWriter.flush();

        bufferWriter.close();
        buffRead.close();
        fileInput.close();
        fileOutput.close();

    }
}












