package br.senai.sp.jandira.app;

import br.senai.sp.jandira.agencia.*;
import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		agencia.setNumero("0505-4");
		agencia.setGerente("Rodrigo Silva");
		agencia.setCidade("Jandira");
		agencia.setTelefone("(11)98763-6540");
		

		// Criar cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Fernanda");
		clienteMaria.setEmail("mariafernanda9876@gmail.com");
		clienteMaria.setSalario(2000.);
		
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("0505-4");
		contaMaria.setTitular(clienteMaria);
		contaMaria.tipo = TipoConta.CORRENTE;
		contaMaria.setTipo(TipoConta.CORRENTE);

		contaMaria.depositar(400);
		System.out.println(contaMaria.getTipo());
		System.out.println(contaMaria.getnumeroAgencia());

		// Criar cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Henrique");
		clientePedro.setEmail("pedrohenri@gmail.com");
		clientePedro.setSalario(2330.);


		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.tipo = TipoConta.POUPANCA;
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.depositar(200);
		System.out.println(contaPedro.getTipo());
		System.out.println(contaPedro.getnumeroAgencia());

		// Criar cliente Anna
		Cliente clienteAnna = new Cliente();
		clienteAnna.setNome("Anna Julia");
		clienteAnna.setEmail("annajuju34@gmail.com");
		clienteAnna.setSalario(2150.);
		;

		// Criação da conta da Anaa
		Conta contaAnna = new Conta("2314-9");
		contaAnna.setTitular(clienteAnna);
		contaAnna.tipo = TipoConta.SALARIO;
		contaAnna.setTipo(TipoConta.SALARIO);
		contaAnna.depositar(2000);
		System.out.println(contaAnna.getTipo());
		System.out.println(contaAnna.getnumeroAgencia());

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAnna.exibirDetalhes();

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

		// transferencia conta da maria para conta do pedro
		contaPedro.transferir(contaMaria, 400);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("********************************");
		System.out.println(contaMaria.getTitular().getNome());
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(contaAnna.getTitular().getNome());
	}
	 
	
}
