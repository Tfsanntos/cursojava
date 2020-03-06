package br.com.impacta.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;

public class AppAlunos {
	public static void main(String[] args) {
		
		try {
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula"));
			String nome   = JOptionPane.showInputDialog("Informe o nome do aluno");
			
			Aluno aluno  = new Aluno(nome, matricula);
			int confirma = JOptionPane.showConfirmDialog(null, "Deseja incluir a lista de cursos", 
														"Confirmação", JOptionPane.YES_OPTION);
			
			if(confirma == JOptionPane.YES_NO_OPTION) {
				FileReader reader = new FileReader("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos\\cursos.txt");
				
				BufferedReader buffer = new BufferedReader(reader);
				
				List<Curso> cursos = new ArrayList<>();
				
			//OBTENDO CADA LINHA DO ARQUIVO
			//A PARTIR DA LINHA OBTER AS INFORMAÇÕES INDIVIDUAIS COM ESTAS INFORMAÇÕES CRIAR OBJETO CURSO
			// FINALMENTE CADA OBJETO É INSERIDO NA LISTA.
				
				while(true) {
					String linha   = buffer.readLine();
					
					if(linha == null) {
					break;
					}
					
					String[] itens = linha.split(";"); 
						
					Curso curso = new Curso(
							Integer.parseInt(itens[0].trim()),
							itens[1],
							Integer.parseInt(itens[2].trim()),
							Double.parseDouble(itens[3].trim()));
							
							cursos.add(curso);
				} 
				buffer.close();
				reader.close();
				aluno.setCursos(cursos);
				
			}
			System.out.println(aluno.exibirValores());
			System.out.println(aluno.exibirCursos());
			
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja incluir no arquivo?",
													 "Confirmação", JOptionPane.YES_NO_OPTION);
			if (opcao == JOptionPane.YES_NO_OPTION) {
				
				Date data           = new Date();
				SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy_HHmm");
			
				String arquivo = "aluno_" + df.format(data) + ".txt";
				
				FileWriter write = new FileWriter ("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos" + arquivo);
				
				write.write(aluno.exibirValores());
				write.write(aluno.exibirCursos());
				write.close();
				
				JOptionPane.showMessageDialog(null, "Arquivo \"" + arquivo + "\" criado com sucesso");
				
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
