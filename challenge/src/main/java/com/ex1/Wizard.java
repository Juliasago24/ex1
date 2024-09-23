package com.ex1;

public class Wizard  extends Character implements Attacker{
    
    int mana = (int) (Math.random() * 50) +9;
    int intelligence = (int) (Math.random() * 50) + 1;
    

    //Setters and getters
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Constructor
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    //Attack
    public void attack(Character character){
        

        int aleatorio = (int) (Math.random() * 2) + 1;
        if (aleatorio==1){
            System.out.println("A Staff hit will be casted");
            character.hp = character.hp -2;
            System.out.println(character.name+ " hp: "+character.hp);
            mana=mana+1;
            
        }
            else {
                if (mana <5){
                    character.hp = character.hp -2;
                    mana=mana+1;
                    System.out.println(character.name+ " hp: "+character.hp);

                }
                else{
                
                System.out.println("A Fireball will be casted");
                character.hp = character.hp -intelligence;
                System.out.println(character.name+ " hp: "+character.hp);
                mana = mana - 5;
