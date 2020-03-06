package br.com.impacta.aplicacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.impacta.classes.Curso;

public class AppLerListaCursos {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new 
					FileInputStream("C:\\\\Users\\\\di2504\\\\Documents\\\\Curso_Java\\\\Arquivos\\\\cursos.dat");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Curso> c = (ArrayList<Curso>)ois.readObject();
			
			ois.close();
			fis.close();
			
			c.forEach(p -> {
				System.out.println(p.exibirValores());
				System.out.println();
			});
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

}
