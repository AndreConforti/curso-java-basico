package com.loiane.cursojava.aula13.labs;

public class Felinos {

	String tipo;
	
	public static void main(String[] args) {
		
		Felinos animal1 = new Felinos();
		Felinos animal2 = new Felinos();
		
		animal1.tipo = "gato";
		animal2.tipo = "le�o";
		
		System.out.println("Para a classe Felinos, foram criados dois objetos. S�o eles: " + animal1.tipo + " e " + animal2.tipo);

	}

}
