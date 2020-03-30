package com.company;

public class Main {

    public static void main(String[] args) {
        randomNumber();
    }

    public static void randomNumber(){
        System.out.println((int)  (Math.random()*100)+1);
    }
}