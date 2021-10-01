package br.senai.sp.jandira.app;

import java.awt.Color;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7210-8");
		contaMaria.titular = "Maria Fernanda";
		contaMaria.setnumeroAgencia("1050-9");
		contaMaria.setTipo(TipoConta.POUPANCA);
		contaMaria.depositar(400);
		System.out.println(contaMaria.getTipo());
		System.out.println(contaMaria.getnumeroAgencia());


		// Criação da conta do Pedro
		Conta contaPedro = new Conta("0556-9");
		contaPedro.titular = "Pedro Henrique";
		contaPedro.setnumeroAgencia("5024-7");
		contaPedro.setTipo(TipoConta.SALARIO);
		contaPedro.depositar(200);
		System.out.println(contaPedro.getTipo());
		System.out.println(contaPedro.getnumeroAgencia());
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2045-5");
		contaAna.titular = "Anna Júlia";
		contaAna.setnumeroAgencia("2078-9");
		contaAna.setTipo(TipoConta.CORRENTE);
		contaAna.depositar(2000);
		System.out.println(contaAna.getTipo());
		System.out.println(contaAna.getnumeroAgencia());

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
