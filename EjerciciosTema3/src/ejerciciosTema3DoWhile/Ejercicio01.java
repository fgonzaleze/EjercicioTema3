package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Establecemos la variable a 1 ya que el ejercicio nos pide que empecemos por 1 //
		int num = 1;
		// Abrimos el escáner //
		Scanner sc = new Scanner(System.in);
		// Usamos el bucle do while para imprimir num, que irá sumando uno en cada bucle gracias a num++ //
		do {
			System.out.println(num);
			num++;	
		// La condición del while será que el num sea menos o igual a 20, momento en el que saldrá del bucle y dejará de contar //
		} while (num <= 20);
		// Cerramos escáner //
		sc.close();
	}

}
