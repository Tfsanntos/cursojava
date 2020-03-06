package br.com.impacta.classes;

import java.io.Serializable;

public class Curso implements Comparable<Curso>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3811727754035827764L;
	
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	public Curso(int codigo, String descricao, int ch, double preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo <= 0) {
			throw new NumberFormatException("O c�digo deve ser positivo");
		}
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.trim().length() == 0) {
			throw new NullPointerException("Descri��o inv�lida");
		}
		
		
		this.descricao = descricao;
	}
	
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		if(ch <= 0) {
			throw new NumberFormatException(
				"A carga hor�ria deve ser positiva");
		}
		this.ch = ch;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco < 0) {
			throw new NumberFormatException(
				"O pre�o n�o pode ser negativo");
		}
		this.preco = preco;
	}
	
	public String exibirValores() {
		return "DADOS DO CURSO\n" +
				"\nC�digo: " + this.getCodigo() +
				"\nDescri��o: " + this.getDescricao() +
				"\nCarga Hor�ria: " + this.getCh() +
				"\nPre�o: " + this.getPreco();
	}
	@Override
	
	public String toString() {
		return "[" + this.getCodigo() + ',' + this.getDescricao() + "]";
	}

// ORDENACAO DE LISTA DE OBJETO ATRAVES COM COMPARABLE 
	@Override
	public int compareTo(Curso o) {
		if (this.getDescricao().compareTo(o.getDescricao()) == 0) {
			Integer c1 = this.getCodigo();
			Integer c2 = o.getCodigo();
			return c1.compareTo(c2);
		}
			
		return this.getDescricao().compareTo(o.getDescricao());
	}
	
	@Override
	public int hashCode() {
		Double d = this.getPreco();
		return this.getCodigo() + this.getCh() + this.getDescricao().hashCode() + d.hashCode();
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if (o instanceof Curso); {
//		Curso c = (Curso); 
//		if (this.getCodigo() == c.getCodigo()                    && 
//				   this.getDescricao().equals(c.getDescricao()   &&
//				   this.getCh()    == c.getCh()                  &&
//				   this.getPreco() == c.getPreco() }
//				   return true;
//		
//	    {
//				   return false;
//		}
//	}
	
	
}









