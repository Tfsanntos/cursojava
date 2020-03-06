package br.com.impacta.classes;

public class Automovel {
	
	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	
	private static int NUMERO;
	
	//bloco de inicialização estática
	static {
		NUMERO = 1;
	}
	
	
	//construtores
	public Automovel(String marca) {
		super();
		this.setCodigo(NUMERO++);
		this.setMarca(marca);		
	}
	
	public Automovel(String marca, String modelo) {
		this(marca);
		this.setModelo(modelo);
	}
	
	public Automovel(String marca, String modelo, int ano) {
		this(marca, modelo);
		this.setAno(ano);
	}	
	
	
	
	
	public int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String exibirValores() {
		return "Código: " + this.getCodigo() +
				"\nMarca do automóvel: " + this.getMarca() +
				"\nModelo do automóvel: " + this.getModelo() +
				"\nAno do automovel: " + this.getAno();
	}
}




