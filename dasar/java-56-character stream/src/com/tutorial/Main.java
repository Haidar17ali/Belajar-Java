package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //membuka file
        //byte stream -> FileInputStream
        FileInputStream inputByte = new FileInputStream("input.txt");
        //character -> FileReader
        FileReader inputChar = new FileReader("input.txt");

        FileOutputStream inputByteFile = new FileOutputStream("outbyte.txt");
        FileWriter inputCharFile = new FileWriter("outchar.txt");

        //membaca file

//        //byte stream -> FileInputStream
//        System.out.println((char) inputByte.read());
//        //character -> FileReader
//        System.out.println((char)inputChar.read());

        //byte file
        int buffer = inputByte.read();
        while (buffer != -1){
            System.out.print((char)buffer);
            inputByteFile.write(buffer);
            buffer = inputByte.read();
        }
        System.out.println("\n\n");

        //Char file
        int buffer2 = inputChar.read();
        while (buffer2 != -1){
            System.out.print((char)buffer2);
            inputCharFile.write(buffer2);
            buffer2 = inputChar.read();
        }

        //menutup file
        inputByte.close();
        inputChar.close();
        inputByteFile.close();
        inputCharFile.close();

    }
}
