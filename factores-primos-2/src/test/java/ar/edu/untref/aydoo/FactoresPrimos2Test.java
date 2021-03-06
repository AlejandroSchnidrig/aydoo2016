package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

public class FactoresPrimos2Test {
	
	@Test
    public void calculaFactoresPrimosDelNumero360FormatoPretty(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 360;
		String formato = "--format=PRETTY";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(2, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(2, factores.getNumero(2));
		Assert.assertEquals(3, factores.getNumero(3));
		Assert.assertEquals(3, factores.getNumero(4));
		Assert.assertEquals(5, factores.getNumero(5));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero12FormatoPretty(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 12;
		String formato = "--format=pretty";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(2, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(3, factores.getNumero(2));
	}
   
	@Test
    public void calculaFactoresPrimosDelNumero7FormatoPretty(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 7;
		String formato = "--format=PrettY";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(7, factores.getNumero(0));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero3FormatoQuiet(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 3;
		String formato = "--format=quiet";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(3, factores.getNumero(0));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero24FormatoQuiet(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 24;
		String formato = "--format=qUieT";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(3, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(2, factores.getNumero(2));
		Assert.assertEquals(2, factores.getNumero(3));
	}		
	
	@Test
    public void calculaFactoresPrimosDelNumero60FormatoQuiet(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 60;
		String formato = "--format=QUIET";
		factores.ejecutar(numero, formato);
		
		Assert.assertEquals(5, factores.getNumero(0));
		Assert.assertEquals(3, factores.getNumero(1));
		Assert.assertEquals(2, factores.getNumero(2));
		Assert.assertEquals(2, factores.getNumero(2));
		
}	
	
	@Test
    public void calculaFactoresPrimosDelNumero100SinFormato(){
	
		FactoresPrimos2 factores = new FactoresPrimos2();
		int numero = 100;
		factores.ejecutar(numero);
		
		Assert.assertEquals(2, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(5, factores.getNumero(2));
		Assert.assertEquals(5, factores.getNumero(2));
		
}		
	
	
   
	
}
