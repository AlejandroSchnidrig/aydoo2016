package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.FormatoPretty;



public class FormatoPrettyTest {
	
	@Test
	public void aplicaElFormatoPrettyCorrectamenteAlNumero8(){
		FormatoPretty formato = new FormatoPretty();
		List<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		
		Assert.assertEquals("Factores Primos 8: 2 2 2 ", formato.darFormato(numeros));
	}
	
	@Test
	public void aplicaElFormatoPrettyCorrectamenteAlNumero90(){
		FormatoPretty formato = new FormatoPretty();
		List<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(3);
		numeros.add(3);
		numeros.add(5);
		
		Assert.assertEquals("Factores Primos 90: 2 3 3 5 ", formato.darFormato(numeros));
	}

}