package ejerciciosTema3DoWhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num = 0;
		int menor = 0;
		int mayor = 101;
		String respuesta;
		Scanner sc = new Scanner(System.in);
		do {
			num = (int) (Math.random()*(mayor - menor) + num);
			System.out.println("Es el número " + num + " ?");
			respuesta = sc.nextLine();
			if (respuesta.equals("MAYOR")){
				mayor = num;
			} else if (respuesta.equals("MENOR")) {
				menor = num;
			}
		} while (!respuesta.equals("IGUAL"));
		System.out.println("ENHORABUENA");
		sc.close();

	}

}
