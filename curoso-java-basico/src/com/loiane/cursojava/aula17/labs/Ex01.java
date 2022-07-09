package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean verdade = false;
		
		while (verdade == false){
			System.out.println("Digite uma nota entre 0 e 10:");
			int resp = scan.nextInt();
			if (resp >= 0 && resp <= 10) {
				System.out.println("Você digitou a nota " + resp);
				verdade = true;
			} else {
				System.out.println("Digite uma nota válida");
			}
			
		}

	}

}
