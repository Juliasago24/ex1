package com.ex1;

public class Warrior extends Character implements Attacker{

     //Our attributes
     int stamina;
     int strength;
     
     
     //Getter and setter
     public int getStamina() {
         return stamina;
     }
     public void setStamina(int stamina) {
         this.stamina = stamina;
     }
     public int getStrength() {
         return strength;
     }
     public void setStrength(int strength) {
         this.strength = strength;
     }
 
     //Constructor
     public Warrior(String name, int hp, int stamina, int strength) {
         super(name, hp);
         this.stamina = stamina;
         this.strength = strength;
     }
     
     //The attack
     public void attack(Character character){
        int aleatorio = (int) (Math.random() * 2) + 1;
        if (aleatorio==1){
            System.out.println("A Weak attack will be made");
            character.hp = character.hp -strength/2;
            System.out.println(character.name+ " hp: "+character.hp);
            stamina= stamina+1;
            }
            else{
                if (stamina <5){
                    System.out.println("A Weak attack will be made");
                    character.hp = character.hp -strength/2;
                    System.out.println(character.name+ " hp: "+character.hp);
                    stamina=stamina+1;
                   }
                   else{
                   System.out.println("A Heavy attack will be made");
                   character.hp = character.hp -strength;
                   System.out.println(character.name+ " 