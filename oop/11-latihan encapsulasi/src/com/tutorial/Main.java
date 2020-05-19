package com.tutorial;

class Player {
    private String name;
    private int baseAttack;
    private int baseHealth;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // ini adalah obj member
    private Weapon Weapon;
    private Armor armor;

    public Player(String name) {
        this.name = name;
        this.baseAttack = 100;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementAttack = 20;
        this.incrementHealth = 20;
        this.isAlive = true;

    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void display() {
        System.out.println("Name\t: " + this.name);
        System.out.println("Level\t: " + this.level);
        System.out.println("Attack\t: " + this.getAttackPower());
        System.out.println("Darah\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Alive\t:" + this.isAlive + "\n");
    }

    public void attack(Player opponent) {
        // hitung damage yang diberikan
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.name + " is attacking " + opponent.getName() + " with damage " + damage + "\n");
        // attack opponent
        opponent.defence(damage);

        this.levelUp();

    }

    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.Weapon.getAttack();
    }

    public void defence(int damage) {
        // mendapat damage
        int defencePwer = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power " + defencePwer);

        if (damage > defencePwer) {
            deltaDamage = damage - this.armor.getDefencePower();
        } else {
            deltaDamage = 1;
        }

        System.out.println("Damage earned = " + deltaDamage + "\n");

        // adding total damage
        this.totalDamage += deltaDamage;

        // cek is alive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }
        this.display();
    }

    public void setWeapon(Weapon weapon) {
        this.Weapon = weapon;
    }

    private void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

}

class Weapon {
    private String name;
    private int attackPower;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attackPower = attack;
    }

    public int getAttack() {
        return attackPower;
    }
}

class Armor {
    private String name;
    private int defencePower;
    private int addHealth;

    public Armor(String name, int defencePower, int health) {
        this.name = name;
        this.defencePower = defencePower;
        this.addHealth = health;
    }

    public int getAddHealth() {
        return this.defencePower * 10 + this.addHealth;
    }

    public int getDefencePower() {
        return this.defencePower * 2;
    }

}

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Paidi");
        Armor armor1 = new Armor("Baju Zirah", 17, 100);
        Weapon weapon1 = new Weapon("Zulfikar", 20);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Cak Doel");
        Armor armor2 = new Armor("Partai Golkar", 50, 30);
        Weapon weapon2 = new Weapon("teba", 15);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
    }

}