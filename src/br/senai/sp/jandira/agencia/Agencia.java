package br.senai.sp.jandira.agencia;

public class Agencia {
	
	private String numero;
	private String gerente;
	private String telefone;
	private String cidade;
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String getNumero () {
		return numero;
	}
	
	public void setGerente (String gerente) {
		this.gerente = gerente;
	}
	
	public String getGerente() {
		return gerente;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade () {
		return cidade;
	}

}
