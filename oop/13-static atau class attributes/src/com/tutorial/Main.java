package com.tutorial;

class Display {
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void setType(String inputType) {
        // type = inputType;//alternatif 1
        // this.type = inputType;//alternatif 2
        Display.type = inputType;// alternatif 3(Recomend banget )
    }

    void show() {
        System.out.println("Display Name\t: " + this.name);
    }
}

public class Main {

    public static void main(String[] args) {
        Display display1 = new Display("First Channel");
        display1.show();

        // tampilkan static variable

        // mengganti static variabl

        display1.setType("Monitor");

        System.out.println("\nMenampilkan Static variabel");
        System.out.println(display1.type);
        System.out.println(Display.type);
    }

}