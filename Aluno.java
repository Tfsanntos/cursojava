package br.com.impacta.classes;

import java.util.Formatter;
import java.util.List;

import br.com.impacta.enumeracoes.Generos;

public class Aluno extends Pessoa {
	private int matricula;
	private List<Curso> cursos;
	
//CONSTRUTORES
	public Aluno(String nome) throws Exception {
		super(nome);
	}
	
	public Aluno(String nome, int matricula) 
			throws Exception{
		this(nome);
		this.setMatricula(matricula);
	}
	
	public Aluno(String nome, 
				int idade, 
				Generos sexo, 
				List<Curso> cursos, 
				int matricula) throws Exception, IllegalAccessException {
		this(nome, matricula);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setCursos(cursos);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if(matricula <= 0) {
			throw new NumberFormatException(
				"A matricula deve ser positiva");
		}
		
		this.matricula = matricula;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) throws Exception {
		if(cursos == null) {
			throw new Exception("Lista de cursos não informado");
		}
		this.cursos = cursos;
	}
	
	@Override
	public String exibirValores() {
		return super.exibirValores() +
				"\r\nMatrícula: " + this.getMatricula() ;
	}
	
	public String exibirCursos() {
		if (this.getCursos() == null || this.getCursos().size() == 0) {
			return "\r\nNenhum curso foi atraibuido ao aluno";
		}
		
		StringBuilder sb = new StringBuilder();
		  sb.append("\r\n---------------------------------------------\r\n")
		    .append("CODIGO DESCRIÇÃO           CH           VALOR\r\n")
		    .append("---------------------------------------------\r\n");
		   		        
		        for (Curso curso : this.getCursos()) {
					sb.append (new Formatter().format("%-6s %-20s %-3s %13.2f\r\n", 
							curso.getCodigo(),
							curso.getDescricao(),
							curso.getCh(),
							curso.getPreco()).toString());
					}		        		        
		        sb.append("---------------------------------------------\n\n");  
		        return sb.toString();
	
	}
	
}
