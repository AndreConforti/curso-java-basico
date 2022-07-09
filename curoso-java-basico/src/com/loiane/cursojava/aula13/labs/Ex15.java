package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String triangulo = "";
		
		System.out.println("Digite o tamanho do lado \"A\" do triângulo: ");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o tamanho do lado \"B\" do triângulo: ");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o tamanho do lado \"C\" do triângulo: ");
		double ladoC = scan.nextDouble();
		
		if ( (ladoA >= (ladoB + ladoC)) || (ladoB >= (ladoA + ladoC)) || (ladoC >= (ladoA + ladoB)) ) {
			System.out.println("Com os valores informados, não é possível formar um triângulo");
		} else {
			 if ( (ladoA == ladoB) && (ladoA == ladoC) ) {
				 triangulo = "Equilátero";
			 }else if ( (ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC) ) {
				 triangulo = "Isóceles";
			 }else {
				 triangulo = "Escaleno";
			 }
			 System.out.println("Com os valores informados, é possível formar um triângulo " + triangulo);
		} 
		
	}

}
