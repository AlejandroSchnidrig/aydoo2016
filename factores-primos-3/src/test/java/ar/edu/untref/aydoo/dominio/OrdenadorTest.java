package ar.edu.untref.aydoo.dominio;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.dominio.Ordenador;

public class OrdenadorTest {
	
	@Test
	public void SeleccionaElOrdenAscendenteCorrectamente(){
		
		Ordenador ordenador = new Ordenador();
		List<Integer> numeros = new LinkedList<Integer>();
		List<Integer> ordenados = new LinkedList<Integer>();
		
		String orden = "--sort:asc";
		numeros.add(2);
		numeros.add(2);
		numeros.add(5);
		
		ordenados.add(2);
		ordenados.add(2);
		ordenados.add(5);
		
		Assert.assertEquals(ordenados, ordenador.aplicarOrden(orden, numeros));
	}
	
	@Test
	public void SeleccionaElOrdenDescendenteCorrectamente(){
		
		Ordenador ordenador = new Ordenador();
		List<Integer> numeros = new LinkedList<Integer>();
		List<Integer> ordenados = new LinkedList<Integer>();
		
		String orden = "--sort:des";
		numeros.add(2);
		numeros.add(2);
		numeros.add(5);
		
		ordenados.add(5);
		ordenados.add(2);
		ordenados.add(2);
		
		Assert.assertEquals(ordenados, ordenador.aplicarOrden(orden, numeros));
	}

}
