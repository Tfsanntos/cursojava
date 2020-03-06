package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppCursos {
	public static void main(String[] args) {
		
		try {
			
			int    codigo    = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
			String descricao = JOptionPane.showInputDialog("Nome do Curso: ");
			int    ch        = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária"));
			double preco     = Double.parseDouble(JOptionPane.showInputDialog("Preço :"));
			
			String linha     = "\r\n" + codigo + ";" + descricao + ";" + ch + ";" + preco;
			
			FileWriter write = new FileWriter("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos\\cursos.txt", true);
			
			write.write(linha);
			write.close();
			
			JOptionPane.showMessageDialog(null, "Curso adicionado no arquivo com sucesso!");
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
}
