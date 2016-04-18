package ar.edu.untref.aydoo;

import org.junit.Test;

import java.io.IOException;

import org.junit.Assert;

public class FactoresPrimos3Test {
	
	@Test
    public void calculaFactoresPrimosDelNumero360FormatoPretty(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 360;
		String formato = "--format=PRETTY";
		String orden ="--sort:asc";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(2, factores.getNumeros(0));
		Assert.assertEquals(2, factores.getNumeros(1));
		Assert.assertEquals(2, factores.getNumeros(2));
		Assert.assertEquals(3, factores.getNumeros(3));
		Assert.assertEquals(3, factores.getNumeros(4));
		Assert.assertEquals(5, factores.getNumeros(5));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero12FormatoPretty(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 12;
		String formato = "--format=pretty";
		String orden ="--sort:asc";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(2, factores.getNumeros(0));
		Assert.assertEquals(2, factores.getNumeros(1));
		Assert.assertEquals(3, factores.getNumeros(2));
	}
   
	@Test
    public void calculaFactoresPrimosDelNumero7FormatoPretty(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 7;
		String formato = "--format=PrettY";
		String orden ="--sort:asc";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(7, factores.getNumeros(0));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero3FormatoQuiet(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 3;
		String formato = "--format=quiet";
		String orden ="--sort:des";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(3, factores.getNumeros(0));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero24FormatoQuiet(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 24;
		String formato = "--format=qUieT";
		String orden ="--sort:des";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(3, factores.getNumeros(0));
		Assert.assertEquals(2, factores.getNumeros(1));
		Assert.assertEquals(2, factores.getNumeros(2));
		Assert.assertEquals(2, factores.getNumeros(3));
	}		
	
	@Test
    public void calculaFactoresPrimosDelNumero60FormatoQuiet(){
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 60;
		String formato = "--format=QUIET";
		String orden ="--sort:des";
		factores.ejecutar(numero, formato, orden);
		
		Assert.assertEquals(5, factores.getNumeros(0));
		Assert.assertEquals(3, factores.getNumeros(1));
		Assert.assertEquals(2, factores.getNumeros(2));
		Assert.assertEquals(2, factores.getNumeros(3));
		
	}	
	
	@Test
    public void calculaFactoresPrimosDelNumero12FormatoPrettyEnUnArchivo() throws IOException{
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 36;
		String formato = "--format=pretty";
		String ruta = "--output-file=/home/alejandro/archivo.txt";
		factores.ejecutarConArchivo(numero, formato, ruta);
		
		Assert.assertEquals(2, factores.getNumeros(0));
		Assert.assertEquals(2, factores.getNumeros(1));
		Assert.assertEquals(3, factores.getNumeros(2));
		Assert.assertEquals(3, factores.getNumeros(2));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero60FormatoQuietEnUnArchivo() throws IOException{
	
		FactoresPrimos3 factores = new FactoresPrimos3();
		int numero = 60;
		String formato = "--format=quiet";
		String ruta = "--output-file=/home/alejandro/archivos.txt";
		factores.ejecutarConArchivo(numero, formato, ruta);
		
		Assert.assertEquals(5, factores.getNumeros(0));
		Assert.assertEquals(3, factores.getNumeros(1));
		Assert.assertEquals(2, factores.getNumeros(2));
		Assert.assertEquals(2, factores.getNumeros(3));
		
		
	}	
}	
	
	 
	
	
   
	

