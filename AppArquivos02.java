package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppArquivos02 {
	public static void main(String[] args) {

// 1° EXEMPLO - LEITURA DE ARQUIVO
	
		try {
			FileReader reader = new 
					FileReader("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos\\exemplo.txt");
			
			//String linha  = "";
			StringBuilder sb = new StringBuilder("");
			
			while(true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				//linha += (char)ch;
				sb.append((char)ch);
			}
			reader.close();
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
	}

}
