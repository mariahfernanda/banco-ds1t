package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public String titular;
	private double saldo;

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
	
	public void setnumeroAgencia (String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;		
	}

	public String getnumeroAgencia() {
		return numeroAgencia;
	}
	
	
	// Métodos da classe conta

	public void depositar(double valorDeposito) {
		System.out.println();
		System.out.println("Efetuando depósito ...");

		if (valorDeposito > 0) {
			System.out.println("Depósito efetuado com sucesso");
			saldo += valorDeposito;
		} else {
			System.out.println("não foi possivel realizar esta operação.");
		}

	}

	public boolean sacar(double valorSaque) {
		System.out.println();
		System.out.println("Efetuando saque ...");

		if (valorSaque < 0 || saldo < valorSaque) {
			System.out.println("não foi possivel realizar esta operação.");
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
		System.out.println("Efetuando transerência ...");
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possivel realizar esta operação");
		}
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
