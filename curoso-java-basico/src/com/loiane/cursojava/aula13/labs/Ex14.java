package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String conceito = new String();
		String situacao = new String();

		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();

		double mediaAprov = (nota1 + nota2) / 2;

		if (mediaAprov >= 9 && mediaAprov <= 10) {
			conceito = "A";
		} else if (mediaAprov > 7.5 && mediaAprov < 9) {
			conceito = "B";
		} else if (mediaAprov > 6 && mediaAprov <= 7.5) {
			conceito = "C";
		} else if (mediaAprov > 4 && mediaAprov <= 6) {
			conceito = "D";
		} else {
			conceito = "E";
		}

		switch (conceito) {
		case "A":
		case "B":
		case "C":
			situacao = "Aprovado";
			break;
		case "D":
		case "E":
			situacao = "Reprovado";
			break;
		}

		System.out.println("1ª nota.: " + nota1);
		System.out.println("2ª nota.: " + nota2);
		System.out.println("Média...: " + mediaAprov);
		System.out.println("Conceito: " + conceito);
		System.out.println("Situação: " + situacao);

	}

}
