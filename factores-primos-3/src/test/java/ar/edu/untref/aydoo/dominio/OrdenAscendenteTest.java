package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.OrdenAscendente;

public class OrdenAscendenteTest {
	
	@Test
	public void OrdenaAscendenteCorrectamente(){
		OrdenAscendente orden = new OrdenAscendente();
		List<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		
		Assert.assertEquals(numeros, orden.ordenar(numeros));
	}

}