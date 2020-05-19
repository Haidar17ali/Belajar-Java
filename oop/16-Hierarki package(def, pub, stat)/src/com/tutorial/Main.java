package com.tutorial;

import com.terminal.Console;

//penggunaan private tidak diperobolehkan
// private class test{

// }

class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Paidi");

        player1.show();
        Console.log(player1.getName());

    }

}