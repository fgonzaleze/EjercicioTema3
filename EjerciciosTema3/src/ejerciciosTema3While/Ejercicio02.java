package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int suma = 0; 															// Establecemos la suma como 0 para que a la hora de mepzar a sumar, 
		int num;																// partamos de algo neutro, el 0
		Scanner sc = new Scanner(System.in);									// Abrimos escáner
		System.out.println("Introduce un número entero positivo para sumar, y uno negativo para acabar la cuenta");
		num=sc.nextInt();
		while (num>=0) {														// Hacemos un while para establecer que siempre que añada un número
			suma ++;															// y en cada bucle va a sumar a través de num++
			System.out.println(suma);											// Imprimimos el número de entero que llevamos para seguir la cuenta
			num=sc.nextInt();
		}
		System.out.println("Cantidad de úmeros introducidos: " + suma);			// Cuando no se cumpla el bucle (introduzcan un numero negativo), 
		sc.close();																// Cerramos escáner
	}

}

