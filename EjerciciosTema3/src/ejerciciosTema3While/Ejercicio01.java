package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int suma = 0;														// Establecemos la suma y el int como 0 para que a la hora de  
		int num = 0;														// empezar a sumar partamos de un valor neutro
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números enteros para contar");		// Pedimos con el escáner los números enteros para ir llevando la cuenta
		num=sc.nextInt();													// de la cantidad de números que vamos pidiendo
		while (num>=0) {													// Creamos un bucle 
			suma += num;
			System.out.println(suma);
			num=sc.nextInt();
		}
		System.out.println("Suma: " + suma );
		sc.close();

	}

}