package Ejemplo;

import java.util.Scanner;

public class Main {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número para calcular su factorial: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("No se puede calcular el factorial de un número negativo.");
            } else {
                int resultado = factorial(numero);
                System.out.println("El factorial de " + numero + " es " + resultado);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, introduce un número válido.");
        } finally {
            scanner.close();
        }
    }
}
