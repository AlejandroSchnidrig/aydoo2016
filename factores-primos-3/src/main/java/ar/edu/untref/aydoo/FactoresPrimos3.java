package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FactoresPrimos3 {
	
	int numero;
	private int divisor = 2;
	private List<Integer> valores = new ArrayList<Integer>();
	Salida miSalida = new Salida();
	private BufferedWriter escritor;
	
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
	
	public void formato(String formato, String orden){
		
		String formatoAux = formato.toLowerCase();
		String ordenaux = orden.toLowerCase();
		
		if(formatoAux.equals("--format=pretty") && ordenaux.equals("--sort:asc")){
			miSalida.imprimirFormatoPrettyAscendente(this);
		}else if(formatoAux.equals("--format=pretty") && ordenaux.equals("--sort:des")){
			miSalida.imprimirFormatoPrettydescendente(this);
		}
		
		if(formatoAux.equals("--format=quiet") && ordenaux.equals("--sort:asc")){
			miSalida.imprimirFormatoQuietAscendente(this);
		}else if(formatoAux.equals("--format=quiet") && ordenaux.equals("--sort:des")){
			miSalida.imprimirFormatoQuietDescendente(this);
		}	
	}
	
	private void formatoArchivo(String formato, String ruta) throws IOException {
		
		String formatoAux = formato.toLowerCase();
		String rutaAux = ruta.toLowerCase();
		
		String[] partes = rutaAux.split("=");
		String nuevaRuta = partes[1];
		
		if(formatoAux.equals("--format=pretty")){
			File archivo = new File(nuevaRuta);
			this.escritor = new BufferedWriter(new FileWriter(archivo));
			escritor.write(miSalida.imprimirFormatoPrettyArchivo(this) + miSalida.imprimirFormatoPrettyAscendente(this).toString());
			escritor.close();
		}
	
		if(formatoAux.equals("--format=quiet")){
			File archivo = new File(nuevaRuta);
			this.escritor = new BufferedWriter(new FileWriter(archivo));
			escritor.write(miSalida.imprimirFormatoQuietArchivo(this)+ miSalida.imprimirFormatoQuietDescendente(this).toString());
			escritor.close();
		} 
	}
	
	public void ejecutar(int numero, String formato, String orden){
		this.numero = numero;
		this.calcularFactoresPrimos(numero);
		this.formato(formato, orden);
	}
	
	public void ejecutarConArchivo(int numero, String formato, String ruta) throws IOException{
		this.numero = numero;
		this.calcularFactoresPrimos(numero);
		this.formatoArchivo(formato, ruta);
	}
	
	public int getNumeros(int posicion){
		return valores.get(posicion); 
	}
	
	public List<Integer> getLista(){
		return this.valores;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	

}
