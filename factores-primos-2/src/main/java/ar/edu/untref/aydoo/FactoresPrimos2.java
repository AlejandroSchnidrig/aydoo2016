package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactoresPrimos2 {
	
	int numero;
	private int divisor = 2;
	private List<Integer> valores = new ArrayList<Integer>();
	StringBuilder miString = new StringBuilder();
	
	public void ejecutar(int numero, String formato){
		this.numero = numero;
		this.calcularFactoresPrimos(numero);
		this.formato(formato);
	}
	
	public void ejecutar(int numero){
		this.numero = numero;
		this.calcularFactoresPrimos(numero);
		String formato = "--format=pretty";
		this.formato(formato);
	}
	
	public void calcularFactoresPrimos(int numero){
		
		int resultado;
		int resto;
		
		if(numero > 1){
			resultado = numero/divisor;
			resto = numero % divisor;
			if(resto == 0){
				valores.add(divisor);
				this.calcularFactoresPrimos(resultado);	
			}else{
				divisor = divisor + 1;
				this.calcularFactoresPrimos(numero);
			}
		}
		
	}
	
	public void formato (String formato){
		
		String formatoAux = formato.toLowerCase();
		if(formatoAux.equals("--format=pretty")){
			imprimirFormatoPretty();
		}else if(formatoAux.equals("--format=quiet")){
			imprimirFormatoQuiet();
		}else{
			throw new Error ("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
		}
	}
	
	public int getNumero(int posicion){
		return valores.get(posicion); 
	}
	
	public void imprimirFormatoPretty(){
		for (Integer value : valores) {
		    miString.append(value + " ");
		}
		System.out.println("Factores primos " + this.numero + ": " + miString.toString());
	}
	
	public void imprimirFormatoQuiet(){
		Collections.reverse(valores);
		System.out.println("Factores primos " + this.numero + ":");
		for (Integer element : valores){
		    System.out.println(element);
		}
	}

}
