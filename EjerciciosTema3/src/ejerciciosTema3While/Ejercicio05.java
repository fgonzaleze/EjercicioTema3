package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int num;
		int bucle = 1;
		double mediaNegativo = 0;
		int positivo = 0;
		double negativo = 0;
		int contadorCero = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce diez números enteros");
		num = sc.nextInt();
		while (bucle <= 10) {
			bucle = bucle + 1;
			if (num == 0) {
				contadorCero = contadorCero + 1;
			}
			if (num > 0) {
				positivo = positivo + num;
			}
			if (num < 0) {
				negativo = negativo + num;
				mediaNegativo = mediaNegativo + 1;
				negativo = (double) negativo / mediaNegativo;
			}
			num = sc.nextInt();
		}

		System.out.println("Positivos: " + positivo + " Negativos: " + negativo + " Ceros: " + contadorCero);
		sc.close();

	}

}
