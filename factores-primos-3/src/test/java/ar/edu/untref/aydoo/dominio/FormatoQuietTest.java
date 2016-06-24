package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.FormatoQuiet;

public class FormatoQuietTest {
	
	@Test
	public void aplicaElFormatoQuietCorrectamenteAlNumero16(){
		FormatoQuiet formato = new FormatoQuiet();
		List<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		
		Assert.assertEquals("Factores Primos 16: \n2\n2\n2\n2", formato.darFormato(numeros));
	}
	
	@Test
	public void aplicaElFormatoQuietCorrectamenteAlNumero360(){
		FormatoQuiet formato = new FormatoQuiet();
		List<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(3);
		numeros.add(5);
		
		Assert.assertEquals("Factores Primos 360: \n2\n2\n2\n3\n3\n5", formato.darFormato(numeros));
	}

}
