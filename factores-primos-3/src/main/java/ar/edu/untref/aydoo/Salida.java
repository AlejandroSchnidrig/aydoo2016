package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class Salida {

	StringBuilder miString = new StringBuilder();

	public List<Integer> imprimirFormatoPrettyAscendente(FactoresPrimos3 factor) {
		for (Integer valor : factor.getLista()) {
			miString.append(valor + " ");
		}
		System.out.println("Factores primos " + factor.getNumero() + ": " + miString.toString());
		return factor.getLista();
	}

	public void imprimirFormatoPrettydescendente(FactoresPrimos3 factor) {
		Collections.reverse(factor.getLista());
		for (Integer valor : factor.getLista()) {
			miString.append(valor + " ");
		}
		System.out.println("Factores primos " + factor.getNumero() + ": " + miString.toString());
	}

	public String imprimirFormatoPrettyArchivo(FactoresPrimos3 factor) {
		String aux = "Factores Primos " + factor.getNumero() + ": ";
		return aux;
	}

	public void imprimirFormatoQuietAscendente(FactoresPrimos3 factor) {
		System.out.println("Factores primos " + factor.getNumero() + ":");
		for (Integer elemento : factor.getLista()) {
			System.out.println(elemento);
		}
	}

	public List<Integer> imprimirFormatoQuietDescendente(FactoresPrimos3 factor) {
		Collections.reverse(factor.getLista());
		System.out.println("Factores primos " + factor.getNumero() + ":");
		for (Integer elemento : factor.getLista()) {
			System.out.println(elemento);
		}
		return factor.getLista();
	}

	public String imprimirFormatoQuietArchivo(FactoresPrimos3 factor) {
		String aux = "Factores Primos " + factor.getNumero() + ": ";
		return aux;
	}

}
