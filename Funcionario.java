package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Generos;
import br.com.impacta.excecoes.SalarioInvalidoException;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo) {
		super(nome);
		this.setCargo(cargo);
	}
	
	public Funcionario(String nome, String cargo, double salario) {
		this(nome, cargo);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(String nome, 
						int idade, 
						Generos sexo, 
						String cargo, 
						double salario) throws IllegalAccessException {
		
		this(nome, cargo, salario);
		this.setSexo(sexo);
		this.setIdade(idade);
	}
	
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		//assumindo que o valor minimo para o salario seja de 1000 reais
		if(salario < 1000) {
			throw new SalarioInvalidoException(
				"O salario não pode ser inferior a R$ 1000,00");
		}
		this.salario = salario;
	}
	
	@Override
	public String exibirValores() {
		return super.exibirValores() +
				"\nCargo: " + this.getCargo() +
				"\nSalário: " + this.getSalario();
	}
}
