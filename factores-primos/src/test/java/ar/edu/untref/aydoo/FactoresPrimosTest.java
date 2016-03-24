package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

public class FactoresPrimosTest {
	
	@Test
    public void calculaFactoresPrimosDelNumero360(){
	
		FactoresPrimos factores = new FactoresPrimos();
		int numero = 360;
		factores.calcularFactoresPrimos(numero);
		
		Assert.assertEquals(2, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(2, factores.getNumero(2));
		Assert.assertEquals(3, factores.getNumero(3));
		Assert.assertEquals(3, factores.getNumero(4));
		Assert.assertEquals(5, factores.getNumero(5));
	}
	
	@Test
    public void calculaFactoresPrimosDelNumero12(){
	
		FactoresPrimos factores = new FactoresPrimos();
		int numero = 12;
		factores.calcularFactoresPrimos(numero);
		
		Assert.assertEquals(2, factores.getNumero(0));
		Assert.assertEquals(2, factores.getNumero(1));
		Assert.assertEquals(3, factores.getNumero(2));
	}
   
	@Test
    public void calculaFactoresPrimosDelNumero7(){
	
		FactoresPrimos factores = new FactoresPrimos();
		int numero = 7;
		factores.calcularFactoresPrimos(numero);
		
		Assert.assertEquals(7, factores.getNumero(0));
	}
   
	
}
