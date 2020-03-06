package br.com.impacta.metodos;

public class Metodos {
	
	public static void repetirTexto(String texto, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(texto);			
		}
	}

	public static int contarLetras(String texto) {		
		//encadeamento de metodos
		return texto.replace(" ","").length();					
	}
	
	public static void calcularSoma2(double x, double y) {

		double soma = x + y;
		System.out.println("soma : " + soma);		
	}	
	
	/** 
	 * @author Thais Fernanda 
	 * 
	 * @param x parametro do tipo double
	 * @param y parametro do tipo double
	 * 
	 * @return Valor correspondente a soma de X e Y
	 * 
	 * @see calcularSoma2, calcularSoma
	 */
	
	public static double calcularSoma3(double x, double y) {

		double soma = x + y;
		return soma;
	}
	
	public static void mostrar() {
		System.out.println("Curso Java");
		System.out.println("100 horas");
		System.out.println("------------");
	}
	
	public static void calcularSoma() {
		double x = 10;
		double y = 20;
		double soma = x + y;
		System.out.println("soma : " + soma);
	}
	
	//Array como parametros de métodos
	//Exemplo: escrever um método que receba um array de 
	//inteiros e retorne o maior elemento
	public static int buscarMaior(int[] valores) {
		int maior = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if(valores[i] > maior) {
				maior = valores[i];
			}
		}
		return maior;
	}
	
	//Implementação do varargs - escrever um método que receba 
	//uma quantidade variavel de numeros reais, e retorne a
	//médias destes numeros
	public static double calcularMedia(double... valores) {
		double soma = 0;
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		double media = soma / valores.length;
		media = (int)(media * 100);
				
		return media / 100;
	}
	
}








