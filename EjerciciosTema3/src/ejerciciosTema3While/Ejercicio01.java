package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int suma = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números enteros para contar");
		num=sc.nextInt();
		while (num>=0) {
			suma += num;
			System.out.println(suma);
			num=sc.nextInt();
		}
		System.out.println("Suma: " + suma );
		sc.close();

	}

}