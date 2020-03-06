package br.com.impacta.aplicacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import br.com.impacta.classes.Curso;

public class AppLerObjetoCurso {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new 
					FileInputStream("C:\\\\Users\\\\di2504\\\\Documents\\\\Curso_Java\\\\Arquivos\\\\curso.dat");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Curso c = (Curso)ois.readObject();
			
			ois.close();
			fis.close();
			
			JOptionPane.showMessageDialog(null, c.exibirValores());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

}
