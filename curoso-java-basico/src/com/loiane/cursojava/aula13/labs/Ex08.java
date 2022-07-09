package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o valor da hora? R$ ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantas horas trabalhou? ");
		int qtdHoras = scan.nextInt();
		
		double salario = valorHora * qtdHoras;
		System.out.print("Seu salário será de R$ " + salario);
		

	}

}
