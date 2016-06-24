package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.OrdenDescendente;

public class OrdenDescendenteTest {

	@Test
	public void OrdenaDescendenteCorrectamente(){
		OrdenDescendente orden = new OrdenDescendente();
		List<Integer> numeros = new LinkedList<Integer>();
		List<Integer> descendente = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		
		descendente.add(5);
		descendente.add(3);
		descendente.add(2);
		descendente.add(2);
		
		Assert.assertEquals(descendente, orden.ordenar(numeros));
	}
}