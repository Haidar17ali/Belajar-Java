package com.tutorial;

import java.util.ArrayList;

class Player {

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    public void show() {
        System.out.println("Nama\t\t: " + this.name);
    }

    // static methods
    static void showNumberOfPlayer() {
        System.out.println("Number of palyer : " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }

}

class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Paidi");
        Player player2 = new Player("Cak Doel");
        Player player3 = new Player("Pananang");
        Player player4 = new Player("Hasan");

        player1.show();
        player2.show();

        Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());
        // System.out.println("Names = " + player1.getNames()); ini bisa dilakukan
    }

}