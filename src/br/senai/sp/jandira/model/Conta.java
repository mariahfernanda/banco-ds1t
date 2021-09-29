package br.senai.sp.jandira.model;

public class Conta {

	public String tipo;
	public String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;

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
		}	
		else {
			saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso");
			return true;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {

			boolean resultado = sacar(valorTransferencia);
			
			System.out.println("");
			System.out.println("Efetuando transer�ncia ...");
			if(resultado) {
			contaDestino.depositar(valorTransferencia);
			}
			else {
				System.out.println("N�o foi possivel realizar esta opera��o");
			}
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
