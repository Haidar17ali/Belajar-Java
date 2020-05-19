package com.tutorial;

//player
class Player {
    String nama;
    double darah;
    int level;
    // objek member
    Weapon weapon;
    Armor armor;

    // construct
    Player(String nama, double darah) {
        this.nama = nama;
        this.darah = darah;
    }

    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.nama + " Attacking " + opponent.nama + " with power " + attackPower);

        opponent.defence(attackPower);
    }

    void defence(double attack) {
        // mengambil damage
        double damage;
        if (this.armor.defencPower < attack) {
            damage = attack - this.armor.defencPower;
        } else {
            damage = 0;
        }

        this.darah -= damage;
        System.out.println(this.nama + " get's damage " + damage);

    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nNama : " + this.nama);
        System.out.println("Healt : " + this.darah + "hp");
        this.weapon.display();
        this.armor.display();
    }

}

// senjata
class Weapon {
    double attackPower;
    String nama;

    // construct
    Weapon(String nama, double attackPower) {
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Nama : " + this.nama + ", Attack : " + this.attackPower);
    }

}

// armor
class Armor {
    double defencPower;
    String nama;

    // construct
    Armor(String nama, double armor) {
        this.nama = nama;
        this.defencPower = armor;
    }

    void display() {
        System.out.println("Armor : " + this.nama + ", Defence : " + this.defencPower);
    }
}

public class Main {

    public static void main(String[] args) {

        // membuat obj player
        Player player1 = new Player("Sowi", 100);
        Player player2 = new Player("Ekky", 92);

        // membuat obj weapon
        Weapon sword = new Weapon("sword", 37);
        Weapon kapak = new Weapon("kapak", 38);

        // membuat obj armor
        Armor bajuZirah = new Armor("Baju Zirah", 50);
        Armor gladiator = new Armor("Gladiator", 35);

        // equip weapon dan armor
        // set player1
        player1.equipWeapon(sword);
        player1.equipArmor(bajuZirah);

        player1.display();
        // set player2
        player2.equipWeapon(kapak);
        player2.equipArmor(gladiator);

        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nRound-1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        player2.attack(player1);
        player1.display();
        player2.display();
    }

}
