package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos las variables, dependiendo de donde partamos, suma en 0, num en 1
		int suma = 0;
		int num;
		int cuenta = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		do {
			System.out.println("+" + cuenta);
			cuenta++;
			suma += cuenta;
		} while (cuenta < num);
		System.out.println(suma);
		sc.close();
	}

}
