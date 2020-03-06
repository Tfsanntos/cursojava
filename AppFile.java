package br.com.impacta.aplicacao;

import java.io.File;

public class AppFile {
	public static void main(String[] args) {

// OBTENDO A LISTA DE PASTAS E ARQUIVOS 
		String caminho = "C:\\Windows\\";
		File file = new File(caminho);
		String[] lista = file.list();
		
		for (String item : lista) {
			File f = new File(caminho + item);
			
			if(f.isDirectory()) {
				System.out.println("[Pasta] " + item);
			} else {
				System.out.println("[Arquivo] " + item);
			}
		}
		
	}

}
