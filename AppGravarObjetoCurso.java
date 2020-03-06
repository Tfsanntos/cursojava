package br.com.impacta.aplicacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Curso;

public class AppGravarObjetoCurso {
	public static void main(String[] args) {
		
		try {
			Curso curso = new Curso(100, "Cobol", 300, 1000);
			FileOutputStream fos = new 
					FileOutputStream("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos\\curso.dat");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(curso);
			oos.close();
			fos.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
	}

}
