package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int num=0;
		int bucle = 1;
		double mediaNegativo = 0;
		int contNegativo = 0;
		int positivo = 0;
		double sumaNegativo = 0;
		int contadorCero = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce diez números enteros");
		
		while (bucle <= 10) {
			num = sc.nextInt();
			bucle = bucle + 1;
			if (num == 0) {
				contadorCero = contadorCero + 1;
			}
			else if (num > 0) {
				positivo = positivo + num;
			}
			else if (num < 0) {
				sumaNegativo = sumaNegativo + num;
				contNegativo++;
				mediaNegativo = sumaNegativo / (double) contNegativo;
			}
		}

		System.out.println("Positivos: " + positivo + " Negativos: " + mediaNegativo + " Ceros: " + contadorCero);
		sc.close();

	}

}
