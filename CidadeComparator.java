package br.com.impacta.classes;

import java.util.Comparator;

public class CidadeComparator implements Comparator<Endereco> {

	@Override
	public int compare(Endereco o1, Endereco o2) {
		return o1.getCidade().compareTo(o2.getCidade());
		
	}
	
}
