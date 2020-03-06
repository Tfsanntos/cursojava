package br.com.impacta.classes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;
	
	//construtor
	public Endereco(String logradouro, int numero, String cidade, String cep) {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setCep(cep);
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero < 0) {
			this.numero = 1;
		} else {
			this.numero = numero;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}	
	
	public String exibirValores() {
		
		String resultado = "Logradouro: " + this.getLogradouro() +
				"\nNumero: " + this.getNumero() +
				"\nCidade: " + this.getCidade() +
				"\nCEP: " + this.getCep();
		return resultado;
	}
}