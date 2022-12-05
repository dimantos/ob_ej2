package com.example;

public class Main {

    public static void main(String[] args) {

        double precio = 53.46;

        System.out.println("El precio con IVA es: " + getPriceIVA(precio));
    }

    static double getPriceIVA(double precio){
        return precio * 1.2;
    }
}
