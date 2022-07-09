package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String triangulo = "";
		
		System.out.println("Digite o tamanho do lado \"A\" do tri�ngulo: ");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o tamanho do lado \"B\" do tri�ngulo: ");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o tamanho do lado \"C\" do tri�ngulo: ");
		double ladoC = scan.nextDouble();
		
		if ( (ladoA >= (ladoB + ladoC)) || (ladoB >= (ladoA + ladoC)) || (ladoC >= (ladoA + ladoB)) ) {
			System.out.println("Com os valores informados, n�o � poss�vel formar um tri�ngulo");
		} else {
			 if ( (ladoA == ladoB) && (ladoA == ladoC) ) {
				 triangulo = "Equil�tero";
			 }else if ( (ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC) ) {
				 triangulo = "Is�celes";
			 }else {
				 triangulo = "Escaleno";
			 }
			 System.out.println("Com os valores informados, � poss�vel formar um tri�ngulo " + triangulo);
		} 
		
	}

}
