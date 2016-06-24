package ar.edu.untref.aydoo.dominio;

import java.util.Iterator;
import java.util.List;

public class FormatoPretty extends Formato{
	
	public String darFormato(List<Integer> numeros) {
		
		String resultado = "";
		
		Iterator<Integer> misNumeros = numeros.iterator();
		while (misNumeros.hasNext()) {
			Integer numeroActual = misNumeros.next();
			String convercion = String.valueOf(numeroActual);
			resultado += convercion + " ";
		}
		String salida = "Factores Primos " + this.multiplicarLista(numeros) + ": " + resultado;
		return salida;
	   
	}
	
	public int multiplicarLista(List<Integer> numeros){
		int resultado = 1;
		for(Integer numero : numeros){
		    resultado *= numero;
		}
		return resultado;
	}

}