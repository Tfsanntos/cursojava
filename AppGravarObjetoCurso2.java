package br.com.impacta.aplicacao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Curso;

public class AppGravarObjetoCurso2 {
	public static void main(String[] args) {
		
		try {
			Curso curso = new Curso(100, "Cobol", 300, 1000);
			
// CRIANDO UM DIRETORIO
			File file = new File("C:\\Users\\di2504\\Documents\\Curso_Java\\Objetos\\");
			
			if (!file.exists()) {
				int opcao = JOptionPane.showConfirmDialog(null, "A pasta destino não existe. Deseja criá-la?",
						                      "Confirmação", JOptionPane.YES_NO_OPTION);
			
				if(opcao == JOptionPane.NO_OPTION) {
					return; }
				
				if(file.mkdir()) {
					JOptionPane.showMessageDialog(null, "Pasta Criada");
				} else {
					throw new Exception("Não foi possivel criar a pasta");
				}
			}
			FileOutputStream fos = new 
					FileOutputStream (file.getAbsolutePath() + "\\curso.dat");
			
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
