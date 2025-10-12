package com.example;

public class Calculator {
    public int add (int x, int y){
        return x+y;
    }

    public int subtract (int x, int y){
        return x-y;
    }
    // Добавим main-метод для запуска
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("Result: " + result);
        System.out.println("Java app is running!");
    }
}
