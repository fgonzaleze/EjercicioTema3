package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double media = 0; 															// Establecemos la suma como 0 para que a la hora de mepzar a sumar, 
		int num = 0;																// partamos de algo neutro, el 0, aquí iremos sumando en el bucle de ser necesario
		double contador = 0;														// Establecemos un contador para llevar la cuenta de los bucles que hagamos
		Scanner sc = new Scanner(System.in);										// Abrimos escáner
		System.out.println("Introduce un número entero positivo para realizar la media, y uno negativo para acabarla");
		num=sc.nextInt();
		while (num>=0) {															// Hacemos un while para establecer que siempre que añada un número
			media += num;															// y en cada bucle va a sumar a través de num++
			contador = contador +1;													// Se irá sumanod +1 en cada vuelta al bucle
			num=sc.nextInt();														// volvemos a pedir el número
		}
		media = (double) media / contador;											// calculamos la media, que será la suma de todos los números pedidos entre la cantidad de veces que se haya repetido el bucle
		System.out.println("Media: " + media);										// Cuando no se cumpla el bucle (introduzcan un numero negativo), imprimimos la media
		sc.close();																	// Cerramos escáner

	}

}
