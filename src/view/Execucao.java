package view;

import model.Pessoa;

public class Execucao {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Julia Araujo Calazans");
		pessoa.setBairro("Itaquera");
		pessoa.setCep(1486459476);
		pessoa.setCidade("S�o Paulo");
		pessoa.setEstado("S�o Paulo");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
		
	}
}
