package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos la variable, en este caso num será 2 porque es el primer número par //
		int num = 2;
		Scanner sc = new Scanner(System.in);
		// Hacemos que el bucle vaya sumando 2 en 2 para obtener los numeros pares impresos //
		do {
			System.out.println(num);
			num = num +2;
		// La condición la establecemos en 200 en este caso ya que es el último número par que nos pide //
		} while (num <= 200);
		// Cerramos escáner //
		sc.close();
	}

}
