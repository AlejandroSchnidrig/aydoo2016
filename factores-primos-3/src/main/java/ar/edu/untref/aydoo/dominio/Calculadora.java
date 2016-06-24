package ar.edu.untref.aydoo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	
	List<Integer> valores = new ArrayList<Integer>();
	
	public List<Integer> calcularFactoresPrimos(int numero) throws NumeroNegativoException{
		
		if(numero <= 0){
			throw new NumeroNegativoException();
		}
		
	    for (int i = 2; i <= numero; i++) {
			while (numero % i == 0) {
				numero = numero / i;
				valores.add(i);
			}
	    }	
	    return valores;
	}
	
}