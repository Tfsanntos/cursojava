package br.com.impacta.aplicacao;

import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AppArquivos03 {
	public static void main(String[] args) {
		
// 2° EXEMPLO - LEITURA DE ARQUIVO
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		JFileChooser chosser = new JFileChooser();
		int opcao = chosser.showOpenDialog(null);
		
		if (opcao == JFileChooser.APPROVE_OPTION) {
			FileReader reader = new FileReader(chosser.getSelectedFile());
			
			StringBuilder sb = new StringBuilder();
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				sb.append((char)ch);
			}
				reader.close();
				System.out.println(sb.toString());
		}
		
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	}	
		
	}

}
