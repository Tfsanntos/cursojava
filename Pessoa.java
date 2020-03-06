package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Generos;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private Generos sexo;
	private Endereco endereco;
	
	//construtores
	public Pessoa(String nome) {
		
		this.setNome(nome);
	}
	
	public Pessoa(String nome, int idade) throws IllegalAccessException {
		this(nome);
		this.setIdade(idade);		
	}
	
	public Pessoa(String nome, int idade, Generos sexo) throws IllegalAccessException {
		this(nome, idade);
		this.setSexo(sexo);		
	}
	
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome Valor a ser fornecido para o nome da pessoa
	 * @exception IllegalArgumentException
	 */
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IllegalAccessException{
		if(idade < 0) {
			throw new IllegalAccessException("A idade não pode ser negativa");
		}
		this.idade = idade;
	}

	public Generos getSexo() {
		return sexo;
	}

	public void setSexo(Generos sexo) {
		if(sexo == null) {
			throw new NullPointerException("Sexo não informado");
		}
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String exibirValores() {
		
		return this.exibirValores("DADOS PESSOAIS");
	}
	
	/**
	 * 
	 * @param titulo valor a ser apresentado como cabeçalho da resposta 
	 * @return Conjunto de informações da Pessoa 
	 * @see exibirValores()
	 * @since 1.0
	 * 
	 */
	
	public String exibirValores(String titulo) {
		
		String resultado = titulo +  
				"\r\n\r\nNome: " + this.getNome() + 
				"\r\nIdade: " + this.getIdade();
				
				if(this.getSexo() != null) {
					resultado += "\nSexo: " + this.getSexo();
				}
		
				if(this.getEndereco() != null) {
					resultado += "\r\nEndereço: \r\n" + 
						this.getEndereco().exibirValores();
				}
		
		return resultado;
	}	
	
	@Override
	public String toString() {
		return this.getNome();
	}
	
	
	
}





