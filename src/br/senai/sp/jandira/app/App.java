package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Cria��o da conta da Maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Fernanda";
		contaMaria.numero = "7845-8";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.tipo = "Corrente";
		contaMaria.depositar(400);

		// Cria��o da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Henrique";
		contaPedro.numero = "6547-6";
		contaPedro.tipo = "Poupan�a";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.depositar(200);

		// Cria��o da conta da Ana
		Conta contaAna = new Conta();
		contaAna.titular = "Anna J�lia";
		contaAna.numero = "23145-9";
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
