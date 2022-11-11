package ejerciciosTema3For;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num;
		int factorial =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo: ");
		num = sc.nextInt();	
		if (num >= 0) {
			for(int i=num; i>=1; i--) {
				if (num > 1) {
					factorial *= i;
				} else {
					System.out.println("No ha introducido un num correcto");
				}
				
			
		}

	}

}
