package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arrayData[] =  {0,1,2,3};
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-");
        int indexInput = userInput.nextInt();

        //exception biasa
        System.out.println("===Exception Biasa===");
        try {
            System.out.printf("data dari index ke- %d adalah %d\n\n", indexInput, arrayData[indexInput]);
        }catch (Exception e){
            System.err.println(e);
        }

        //exception dalam fungsi
        System.out.println("===Exception Fungsi===");
        int data = ambilDataArray(arrayData,indexInput);
        System.out.printf("data index ke-%d adalah %d\n\n", indexInput, data);

        //exception throw by method
        System.out.println("===Exception Throws Method===");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData,indexInput);
        }catch (Exception e){
            System.err.println(e);
        }

        System.out.printf("data index ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("akhir program");
    }

    private static int ambilData(int arr[],int index) throws Exception{
        int hasil = arr[index];
        return hasil;
    }

    private static int ambilDataArray(int arr[],int index){
        int hasil =0;
        try {
            hasil = arr[index];
        }catch (Exception e){
            System.err.println(e);
        }
        return hasil;
    }

}
