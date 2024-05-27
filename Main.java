package com.generation;

import java.util.Scanner;

public class Main {
	
// Angelica Hernández
// 5/5
// Revisó Andrea Sánchez

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int ni = sc.nextInt();

        int afo = 0;
        int noAfo = 0;
        int c = ni;

        while (c > 0) {
            int digito = c % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + ni + " es un número afortunado.");
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }

        sc.close();
    }
}

