package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int suma = 0;															// Usamos suma y num con valor 0 para que al realizar la suma parta de 0
		int num = 0;
		Scanner sc = new Scanner(System.in);									// Abrimos escáner
		System.out.println("Introduce números enteros para sumar");				// Pedimos los números enteros para realizar la suma
		num=sc.nextInt();
		while (num>=0) {														// En el bucle usamos un while con la condición que parará el mismo, este caso un num negativo
			suma += num;														// Sumamos el numero introducido, y se irá añadiendo hasta romper el bucle
			System.out.println(suma);
			num=sc.nextInt();
		}
		System.out.println("Suma: " + suma );									// Cuando el bucle se rompa imprimimos la suma
		sc.close();																// Cerramos el escáner

	}

}