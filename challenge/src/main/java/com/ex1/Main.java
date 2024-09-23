package com.ex1;

public class Main {
    public static void main(String[] args) {
        

        //Creating the characters
        int hpManolo = (int) (Math.random() * 200) + 100;
        Warrior manolo = new Warrior("Manolo",hpManolo,25, 5);
        int hpJoseLuis = (int) (Math.random() * 100) + 50;
        Wizard joseLuis = new Wizard("Jose Luis", hpJoseLuis, 25, 25);

        System.out.println("You have created the characters");


        while (manolo.hp>=0 & joseLuis.hp>=0){
            manolo.attack(joseLuis);
            joseLuis.attack(manolo);


        }
        

        
    }
}