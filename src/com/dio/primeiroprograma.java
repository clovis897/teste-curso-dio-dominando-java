package com.dio;

import com.dio.model.Gato;

public class primeiroprograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
	    Livros livros = new Livro();
	    System.out.println(gato);
	    System.out.println(Livro);
	    
		/*int a = 2;
		int b = 3; 
	System.out.println("Helo Wold!" + (a+b));*/

	}

}
class Livros {
	private String nome;
	private String npag;
}