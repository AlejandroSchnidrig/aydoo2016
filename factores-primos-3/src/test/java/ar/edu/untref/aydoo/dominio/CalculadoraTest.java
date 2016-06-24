package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.Calculadora;
import ar.edu.untref.aydoo.dominio.NumeroNegativoException;


public class CalculadoraTest {
	
	@Test
	public void CalculaFactoresDe90Correctamente() throws NumeroNegativoException{
		Calculadora calculadora = new Calculadora();
		List<Integer> esperado = new LinkedList<Integer>();
		
		esperado.add(2);
		esperado.add(3);
		esperado.add(3);
		esperado.add(5);
		
		Assert.assertEquals(esperado, calculadora.calcularFactoresPrimos(90));
	}
	
	@Test
	public void CalculaFactoresDe360Correctamente() throws NumeroNegativoException{
		Calculadora calculadora = new Calculadora();
		List<Integer> esperado = new LinkedList<Integer>();
		
		esperado.add(2);
		esperado.add(2);
		esperado.add(2);
		esperado.add(3);
		esperado.add(3);
		esperado.add(5);
		
		Assert.assertEquals(esperado, calculadora.calcularFactoresPrimos(360));
	}
	
	@Test
	public void CalculaFactoresDe7Correctamente() throws NumeroNegativoException{
		Calculadora calculadora = new Calculadora();
		List<Integer> esperado = new LinkedList<Integer>();
		
		esperado.add(7);
		
		Assert.assertEquals(esperado, calculadora.calcularFactoresPrimos(7));
	}
	
	@Test(expected = NumeroNegativoException.class)
	public void SeEsperaNumeroNegativoException() throws NumeroNegativoException{
		Calculadora calculadora = new Calculadora();
		calculadora.calcularFactoresPrimos(-10);
	}

}