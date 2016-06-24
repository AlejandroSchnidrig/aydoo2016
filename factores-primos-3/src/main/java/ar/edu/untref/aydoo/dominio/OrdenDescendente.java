package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrdenDescendente extends Orden {

	public List<Integer> ordenar(List<Integer> misNumeros) {
		
		List<Integer> reverso = new LinkedList<Integer>();
		ListIterator<Integer> it = misNumeros.listIterator(misNumeros.size());
		while(it.hasPrevious()){
			int numero = it.previous();
			reverso.add(numero);
		}
		
		return reverso;
	}
}