package br.com.hesketh.dragonball.raca;

public class Humano extends Humanoide{

	public Humano(String nome, int idade, int poderLuta, int poderMagia) {
		super(nome, idade, poderLuta, poderMagia);
	}

	@Override
	public void falar() {
		System.out.printf("Sou um humano, meu nome é %s.", super.getNome());
	}

}
