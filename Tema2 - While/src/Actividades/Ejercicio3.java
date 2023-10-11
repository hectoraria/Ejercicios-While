package Actividades;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//variable para almacenar los numeros introducidos
		double suma = 0;
		//Variable para saber cuantos numeros a introducido
		double contador = 0;
		// Valor que vamos a leer del teclado
		double numero;
		//Variable de la media
		double media;
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número al usuario
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextDouble();	
		
		while(numero >= 0) {
			suma += numero ; 
			contador++;
			// Pedimos un número al usuario
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextDouble();
		}
		//Funcion media 
		media= suma / contador;
		// Imprimimos el resultado de la suma
		System.out.println("Media= " + media);
		//Cerramos escaner
		sc.close();
	}

}