package Ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class factorial {

    public static ArrayList<Integer> encontrarPrimos(int n) {
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> noPrimos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!noPrimos.contains(i)) {
                primos.add(i);

                for (int j = i * i; j <= n; j += i) {
                    noPrimos.add(j);
                }
            }
        }

        return primos;
    }

    public static ArrayList<Integer> encontrarFactoresPrimos(int numero) {
        ArrayList<Integer> factores = new ArrayList<>();
        int divisor = 2;

        while (numero > 1) {
            while (numero % divisor == 0) {
                factores.add(divisor);
                numero /= divisor;
            }
            divisor++;
        }

        return factores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero < 2) {
            System.out.println("El número debe ser mayor o igual a 2.");
        } else {
            ArrayList<Integer> listaDePrimos = encontrarPrimos(numero);
            ArrayList<Integer> factores = encontrarFactoresPrimos(numero);

            System.out.println("Números primos desde 2 hasta " + numero + ": " + listaDePrimos);
            System.out.println("Factores primos de " + numero + ": " + factores);
        }
        scanner.close();
    }
}
