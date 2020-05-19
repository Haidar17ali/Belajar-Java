package com.tutorial;

public class Main {

    public  static void main(String[] args){

        //Operator Bitwise --> operator untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;

        //operator shift left
        System.out.println("==== SHIFT LEFT (<<) ====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);

        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits,b);

        //operator shift right
        a = 24;

        System.out.println("==== SHIFT RIGHT (>>) ====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);

        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits,b);

        //operator bitwise or
        a = 24;

        System.out.println("==== BITWISE OR (|) ====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("==============OR==============");
        c =(byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        System.out.println("ini menjumlahkan setiap bitnya contoh 00011000 + 00001100 = 00011100");

        //operator bitwise and
        a = 24;

        System.out.println("==== BITWISE AND (&) ====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("==============AND==============");
        c =(byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        System.out.println("ini menjumlahkan setiap bitnya contoh 00011000 + 00001100 = 00011100");

        //operator bitwise xor
        a = 24;

        System.out.println("==== BITWISE XOR (^) ====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("==============XOR==============");
        c =(byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        System.out.println("ini menjumlahkan setiap bitnya contoh 00011000 + 00001100 = 00011100");

        //operator negasi / not
        System.out.println("==== BITWISE NEGASI (~) ====");
        a = 24;
        b = (byte)(~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.println("==============NOT==============");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);

    }


}
