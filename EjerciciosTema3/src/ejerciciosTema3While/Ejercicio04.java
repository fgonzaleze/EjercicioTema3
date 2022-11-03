package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	
		int num = 0;
		Scanner sc = new Scanner(System.in);																	// Abrimos escáner
		System.out.println("Introduce un número para saber si es par o impar. Usa 0 para acabar");				// Pedimos el número para saber si es par o impar
		num=sc.nextInt();
		while (num!=0) {																						// En el bucle hacemos que se cumpla cuando el num no es 0, ya que 0 parará el bucle
			if (num % 2 == 0) {																					// Necesitamos una condicional, en caso de que sea par el resto de módulo 2 deberá ser 0
				System.out.println("Par");																		// Imprimimos "Par"
				num=sc.nextInt();																				// Volvemos a pedir número para evitar el bucle infinito
			} else {																							// El else lo vamos a utilizar cuando no se cumpla que el numore sea par, entonces será impar 
				System.out.println("Impar");																	// Imprimimos "Impar"
				num=sc.nextInt();																				// Volvemos a pedir número para continuar el bucle
			}
		}
		sc.close();																								// Cerramos escáner
	}

}
