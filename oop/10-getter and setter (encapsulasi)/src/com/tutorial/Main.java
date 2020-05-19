package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        intPublic = 0;
        intPrivate = 0;
    }

    void display() {
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari) {
        this.diameter = jari * 2;
    }

    // getter
    public double getJari2() {
        return this.diameter / 2;
    }

    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }

}

public class Main {

    public static void main(String[] args) {

        Data obj = new Data();
        // read and write dengan menggunakan public
        obj.intPublic = 10;// write
        System.out.println(obj.intPublic);// read

        // read only menggunakan getter
        int get = obj.getIntPrivate();
        System.out.println("Getter : " + get);

        // write only hanya bisa menulis dengan menggunakan setter
        obj.setDoublePrivate(77.5);
        obj.display();

        // gaungkan read dan write dengan set and get
        Lingkaran obj2 = new Lingkaran(5);
        System.out.println(obj2.getJari2());
        obj2.setJari2(14);
        System.out.println(obj2.getJari2());

        System.out.println("Luas : " + obj2.getLuas());
    }

}
