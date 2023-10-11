package Actividades;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Valor que vamos a leer del teclado
		int numero;

		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
				
		// Pedimos un número al usuario
		System.out.println("Introduzca un número para saber si es par o impar");
		numero = sc.nextInt();	
				
		while(numero!=0) {
		 if (numero%2==0) {
		 System.out.println("Es par");
		}else {
		System.out.println("Es impar");
		}
					
		// Pedimos un número al usuario
		System.out.println("Introduzca 0 para salir: ");
		numero = sc.nextInt();
	}
			
		
		//Cerramos escaner
		sc.close();
	}

}