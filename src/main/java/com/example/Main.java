package com.example;

public class Main {
    public static void main(String[] args) throws Exception {

        Feline felineLion = new Feline();
        Lion simba = new Lion("Самец", felineLion);

        System.out.println("Грива: " + simba.doesHaveMane());
        System.out.println(simba.getKittens());
        System.out.println(simba.getFood());

        Feline felineCat = new Feline();
        Cat cat = new Cat (felineCat);
        System.out.println(cat.getFood());
        System.out.println(cat.predator);
    }
}
