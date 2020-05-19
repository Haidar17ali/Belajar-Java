package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int array[] = {1,2,3,4};
        Scanner userInput =new Scanner(System.in);
        System.out.print("Nilai Array ke: ");
        int index = userInput.nextInt();
        FileInputStream fileInput = null;

        //exception handling(try,cath,finally)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d adalah %d\n",index, array[index]);
        }catch (Exception e){
            System.err.println(e);
        }

        //runtime eror jika file tidak ada
        System.out.println("handling file not found");
        try {
            fileInput = new FileInputStream("input.txt");
        }catch (IOException e){
            System.err.println(e);
        }

        //menggabungkan 2 exception
        System.out.println("menggabungkan 2 exception");

        try {
            System.out.printf("index ke-%d adalah %d\n",index, array[index]);
            fileInput = new FileInputStream("input.txt");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukkan melebihi index yang ada");
        }catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        System.out.println("Finally");
        try {
            System.out.printf("index ke-%d adalah %d\n",index, array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukkan melebihi index yang ada");
        }finally {
            System.out.println("Finally");
        }

        System.out.println("\nakhir program");

    }
}
