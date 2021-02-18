package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, inv = 0, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inversión de un número");
        System.out.println("Por favor introduce un número");

        num= sc.nextInt();

        while (num >0){
            res= num % 10;
            inv = inv * 10 + res;
            num /= 10;
        }
        System.out.println("El número invertido es: " + inv);

    }
}
