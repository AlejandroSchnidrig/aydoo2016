package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	private int divisor = 2;
	private List<Integer> valores = new ArrayList<Integer>();
	
	public void calcularFactoresPrimos(int numero){
		
		int resultado;
		int resto;
		
		if (numero > 1){
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
	
	public int getNumero(int posicion){
		return valores.get(posicion); 
	}
	
	public List<Integer> getLista(){
		return this.valores;
	}

}
