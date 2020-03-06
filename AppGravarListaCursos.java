package br.com.impacta.aplicacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import br.com.impacta.classes.Curso;

public class AppGravarListaCursos {
	public static void main(String[] args) {
		
		try {
			List<Curso> cursos = new ArrayList<>();
			cursos.add(new Curso (100, "Cobol", 300, 1000));
			cursos.add(new Curso (200, "SuperCalc", 200, 2000));
			
			
			FileOutputStream fos = new 
					FileOutputStream("C:\\Users\\di2504\\Documents\\Curso_Java\\Arquivos\\cursos.dat");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cursos);
			oos.close();
			fos.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
	}

}
