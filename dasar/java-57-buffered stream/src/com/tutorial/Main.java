package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        long waktuStart, waktuFinish;
        //membaca dari file
        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.println(fileInput.available());

        //menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(fileInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish-waktuStart));
        fileInput.close();

        //membaca dari memory
        FileInputStream inputFile = new FileInputStream("input.txt");
        BufferedInputStream buffered = new BufferedInputStream(inputFile);

        buffered.mark(200);//berfungsi untuk mereset
        //menghitung waktu
        waktuStart = System.nanoTime();
        System.out.println(buffered.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish-waktuStart));

        //baca ulang
        buffered.reset();
        byte data[] = buffered.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        buffered.close();
        inputFile.close();

        //menulis dengan buffer output
        FileOutputStream fileoutpu = new FileOutputStream("output.txt");
        BufferedOutputStream buuferOutput = new BufferedOutputStream(fileoutpu);

        //write data byte
        buuferOutput.write(data,0,data.length);
        buuferOutput.flush();

        buuferOutput.close();
        fileoutpu.close();

    }
}










