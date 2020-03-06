package br.com.impacta.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AppArquivos04 {
	public static void main(String[] args) {
		
// 2° EXEMPLO - LEITURA DE ARQUIVO
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		JFileChooser chosser = new JFileChooser();
		int opcao = chosser.showOpenDialog(null);
		
		if (opcao == JFileChooser.APPROVE_OPTION) {
			FileReader reader = new FileReader(chosser.getSelectedFile());
			
			BufferedReader buffer = new BufferedReader(reader);
			
			StringBuilder sb = new StringBuilder();
			while (true) {
				String linha = buffer.readLine();
				if (linha == null) {
					break;
				}
				sb.append(linha).append('\n');
			}
				buffer.close();
				reader.close();
				System.out.println(sb.toString());
		}
		
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	}	
		
	}

}
