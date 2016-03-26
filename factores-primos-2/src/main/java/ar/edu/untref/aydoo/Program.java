package ar.edu.untref.aydoo;

public class Program 
{
    public static final void main(String arg[]){
    
    	try{
    		FactoresPrimos2 factores = new FactoresPrimos2();
    		int numero = Integer.parseInt(arg[0]);
    		String formato = arg[1];
    		factores.ejecutar(numero, formato);
    	}catch(ArrayIndexOutOfBoundsException e){
    		FactoresPrimos2 factores = new FactoresPrimos2();
    		int numero = Integer.parseInt(arg[0]);
    		factores.ejecutar(numero);
    	}
    }
} 
