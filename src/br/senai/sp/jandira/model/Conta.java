package br.senai.sp.jandira.model;

import br.senai.sp.jandira.agencia.*;
import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	// M�todos da classe Conta

	public TipoConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente titular;
	private double saldo;

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	// Construidores da classe conta

	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	public void setTipo(TipoConta tipo) {

		this.tipo = tipo;

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Agencia getnumeroAgencia() {
		return agencia;
	}

	// M�todos da classe conta

	public void depositar(double valorDeposito) {
		System.out.println();
		System.out.println("Efetuando dep�sito ...");

		if (valorDeposito > 0) {
			System.out.println("Dep�sito efetuado com sucesso");
			saldo += valorDeposito;
		} else {
			System.out.println("n�o foi possivel realizar esta opera��o.");
		}

	}

	public boolean sacar(double valorSaque) {
		System.out.println();
		System.out.println("Efetuando saque ...");

		if (valorSaque < 0 || saldo < valorSaque) {
			System.out.println("n�o foi possivel realizar esta opera��o.");
			return false;
		} else {
			saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso");
			return true;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {

		boolean resultado = sacar(valorTransferencia);

		System.out.println("");
		System.out.println("Efetuando transer�ncia ...");
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi possivel realizar esta opera��o");
		}
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular.getNome());
		System.out.printf("E-mail: %s\n", titular.getEmail());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Cidade: %s\n", agencia.getCidade());
		System.out.printf("N�mero agencia: %s\n", agencia.getNumero());
		System.out.printf("Telefone: %s\n", agencia.getTelefone());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
