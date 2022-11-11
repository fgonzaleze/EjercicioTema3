package ejerciciosTema3While;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int num=0;
		int bucle = 1;
		double mediaNegativo = 0;
		int contNegativo = 0;
		int positivo = 0;
		double sumaNegativo = 0;
		int contadorCero = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce diez números enteros");
		//  Hacemos un bucle que se repetirá 10 veces, por eso la condición será bucle <= 10  //
		// Num dentro del bucle, para que cuando introduzcamos a través del escáner sea dentro del while //
		// Por último ponemos bucle + 1 para que vaya sumando hasta llegar a 10 cada vez que pase por el bucle //
		while (bucle <= 10) {
			num = sc.nextInt();
			bucle = bucle + 1;
		// Tenemos que crear un if dentro del bucle para cada una de las posibilidades, en este caso que sea 0 //
		// Sumaremos +1 al contador de ceros para llvar un recuento //
			if (num == 0) {
				contadorCero = contadorCero + 1;
			}
		// Si el número es mayor que 0, en este caso los iremos sumando en la variable positivo //
			else if (num > 0) {
				positivo = positivo + num;
			}
		// Por último, si el número es menor que 0, negativo, para calcular la media tendremos: //
		// La suma negativo, donde iremos sumando los números negativos //
		// El contador negativo, donde llevaremos las veces que han introducido un num negativo //
		// La cuenta, en este caso será guardada en media negativo que será la suma de los negativos entre el contador negativo //
			else if (num < 0) {
				sumaNegativo = sumaNegativo + num;
				contNegativo++;
				mediaNegativo = sumaNegativo / (double) contNegativo;
			}
		}
		// Por último imprimimos lo que nos solicitaban //
		System.out.println("Positivos: " + positivo + " Negativos: " + mediaNegativo + " Ceros: " + contadorCero);
		sc.close();

	}

}
