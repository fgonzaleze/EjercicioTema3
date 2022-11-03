package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		
		int aleatorio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número comprendido entre 1 y 100");
		num = sc.nextInt();
		if (num < 1 || num > 100) {
			System.out.println("El número introducido no se corresponde");
		}
		do {
			aleatorio = (int) (Math.random()*100+1);
			
		} while (num!=aleatorio);
		System.out.println("Número correcto!");
		sc.close();

	}

}
