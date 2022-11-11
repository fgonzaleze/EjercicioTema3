package ejerciciosTema3For;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int num;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo: ");
		num = sc.nextInt();	
		if (num > 0) {
			for (int i=2; i<num; i++) {
				if (num % i == 0) { 
					esPrimo = false;
					break;
				}
			}
			System.out.println((esPrimo && num != 1) ? "Es primo" : "No es primo");
		}
		sc.close();
	}

}
