package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.Formateador;



public class FormateadorTest {

	@Test
	public void seleccionaElFormatoPrettyCorrecamente(){
		Formateador formateador = new Formateador();
		List<Integer> numeros = new LinkedList<Integer>();
		
		String formato = "--format=pretty";
		numeros.add(2);
		numeros.add(2);
		numeros.add(5);
		
		Assert.assertEquals("Factores Primos 20: 2 2 5 ", formateador.aplicarFormato(formato, numeros));
	}
	
	@Test
	public void seleccionaElFormatoQuietCorrecamente(){
		Formateador formateador = new Formateador();
		List<Integer> numeros = new LinkedList<Integer>();
		
		String formato = "--format=quiet";
		numeros.add(2);
		numeros.add(2);
		numeros.add(5);
		
		Assert.assertEquals("Factores Primos 20: \n2\n2\n5", formateador.aplicarFormato(formato, numeros));
	}
}
