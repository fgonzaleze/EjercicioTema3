package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int num;
		int cuenta = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para saber su tabla de multiplicar");
		num = sc.nextInt();
		do {
			System.out.println(num + " x " + cuenta + " = " + num * cuenta);
			cuenta++;
		} while (cuenta <= 10);
		sc.close();
	}

}
