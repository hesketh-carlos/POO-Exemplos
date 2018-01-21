package br.com.hesketh.dragonball.raca;

public class Sayadin extends Humanoide{

	private Calda calda;
	
	public Sayadin(String nome, int idade, int poderLuta, int poderMagia) {
		super(nome, idade, poderLuta, poderMagia);
		this.calda = new Calda(1);
	}


	@Override
	public void falar() {
		System.out.printf("Sou um Sayadin, meu nome é %s.", super.getNome());
	}
	
}

class Calda{
	private int tamanho;
	
	Calda(int tamanho){
		this.tamanho = tamanho;
	}
	
	int getTamanho(){
		return this.tamanho;
	}
	
}
