package ar.edu.untref.aydoo;

import java.io.IOException;

public class Program 
{
    public static final void main(String args[]) throws IOException{
    		
    		int contador = args.length;
    		
    		if(contador == 1){
    			FactoresPrimos3 factores = new FactoresPrimos3();
    			int numero = Integer.parseInt(args[0]);
    			String formato = "--format=pretty";
    			String orden = "--sort:asc";
    			factores.ejecutar(numero, formato, orden);
    		}	
    		 
    		if(contador == 2){
    			FactoresPrimos3 factores = new FactoresPrimos3();
        		int numero = Integer.parseInt(args[0]);
        		String formato = args[1].toLowerCase();
        		if(formato.equals("--format=quiet")){
        			String orden ="--sort:des";
        			factores.ejecutar(numero, formato, orden);
        			}else if(formato.equals("--format=pretty")){
        				String orden ="--sort:asc";
        				factores.ejecutar(numero, formato, orden);
        			}
    		}
    		
        	if(contador == 3){
        		FactoresPrimos3 factores = new FactoresPrimos3();
        		int numero = Integer.parseInt(args[0]);
       			String formato = args[1].toLowerCase();
       			String orden = args[2].toLowerCase();
       			if(orden.equals("--sort:asc") || orden.equals("--sort:des")){
       				factores.ejecutar(numero, formato, orden);
       			}else{
       				factores.ejecutarConArchivo(numero, formato, orden);
       			}
       		}
    }
}