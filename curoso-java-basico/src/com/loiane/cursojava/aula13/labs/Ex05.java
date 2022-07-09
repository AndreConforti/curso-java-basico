package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros: ");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " metros = " + cm + " cm");
		

	}

}
