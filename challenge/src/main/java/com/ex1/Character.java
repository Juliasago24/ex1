package com.ex1;
public class Character {
    
    public String id;
    public String name;
    public int hp;
    public boolean isAlive;

    //Constructors
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    
    
    
    
}
