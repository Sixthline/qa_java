package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion simba = new Lion("Самец", feline);

        System.out.println("Грива: " + simba.doesHaveMane());
        System.out.println(simba.getKittens());
        System.out.println(simba.getFood());
    }
}
