package com.tutorial;

//import package eksernal
import com.terminal.*;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Paidi");
        Player player2 = new Player("Cak Doel");
        Player player3 = new Player("Pananang");

        player1.show();
        player2.show();
        player3.show();

        Console.log("Berhasil");

    }

}