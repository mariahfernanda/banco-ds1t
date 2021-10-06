package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta("0505-4");
		contaMaria.titular = "Maria Fernanda";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.tipo = "Corrente";
		contaMaria.depositar(400);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Henrique";
		contaPedro.tipo = "Poupança";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.depositar(200);

		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Anna Júlia";
		contaAna.tipo = "Corrente";
		contaAna.numeroAgencia = "4214-9";
		contaAna.depositar(2000);

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		// Deposito 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();

		// sacar 300 reais da conta da maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();

		// Depositar -200 na conta do pedro
		contaPedro.depositar(200);
		contaPedro.exibirDetalhes();

		// sacar -100 da conta da maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();

		//transferencia conta da maria para conta do pedro
		contaPedro.transferir(contaMaria, 400);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
		
		
		
	}

}
