package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		//ax2 +bx + c
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre om o valor de A: ");
		int a = scan.nextInt();		
		if (a == 0) {
			System.out.println("Não é uma equação do 2º Grau");
		} else {
			System.out.println("Entre om o valor de A: ");		
			int b = scan.nextInt();
			System.out.println("Entre om o valor de A: ");
			int c = scan.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo. Não existem raízes reais");
			} else {
				
				System.out.println("Delta = " + delta);
				double x1 = ((- b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((- b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
		}
	}

}
