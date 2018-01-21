package br.com.hesketh.dragonball.raca;

public abstract class Humanoide {

	private String nome;
	private int idade;
	private int poderLuta;
	private int poderMagia;

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public int getPoderLuta() {
		return poderLuta;
	}

	public int getPoderMagia() {
		return poderMagia;
	}

	public abstract void falar();

	public Humanoide(String nome, int idade, int poderLuta, int poderMagia) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.poderLuta = poderLuta;
		this.poderMagia = poderMagia;
	}
	
	
}
