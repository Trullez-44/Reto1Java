package com.mycompany.punto1;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        while (true) {
            int additions = 0;
            System.out.println("Elige el número a evaluar:");
            int number = numbers.nextInt();
            if (number <= 4) {
                System.out.println("Número erroneo, vuelve a intentar");
                continue;
            }
            for (int cont = 3; cont < number; cont++) {
                if (cont % 3 == 0 && cont % 5 == 0) {
                    System.out.println("MULTIPLO DE 3 Y 5 ENCONTRADO, COLD-EYE SHOULDER AND CONTINUE");
                    continue;
                }
                if (cont % 3 == 0) {
                    additions += cont;
                    System.out.println("ATENCIÓN, MULTIPLO DE 3 ENCONTRADOOOOOOOOOOOOOOOOOOOOOOOO: " + cont);
                }
                if (cont % 5 == 0) {
                    additions += cont;
                    System.out.println("ATENCIÓN, MULTIPLO DE 5 ENCONTRADOOOOOOOOOOOOOOOOOOOOOOOO: " + cont);
                }
            }
            System.out.println("SUMA TOTAL: " + additions);
        }
    }
}
