package Actividades;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Variable para recoger el numeros del usuario
		int numeros ;
		//Variable contador de numeros
		int contar = 0;
		//Varible para recoger los numero positivos
		int numerosPositivos= 0;
		//Varible para recoger los numero negativos
		int numerosNegativos= 0;
		//Varible para recoger los ceros
		int ceros = 0;
		
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Recogo los numeros
		while(contar < 10) {
			contar++ ; 
			// Pedimos un número al usuario
			System.out.println("Introduzca un número(10 numeros): ");
			numeros = sc.nextInt();
			if (numeros>0) {
				 numerosPositivos++;
				}else if(numeros==0) {
				ceros++;
				}else if(numeros<0) {
					numerosNegativos++;
				}
		}
		
		

		//Imprimo
		System.out.println("En los numero hay "+numerosPositivos+" positivos, "+numerosNegativos+ " negativos y "+ceros+" ceros" );
		//Cerramos escaner
		sc.close();
	}

}
