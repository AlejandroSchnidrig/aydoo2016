package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class VotoTest {
	
	@Test
	public void candidatoEsCorrecto(){
		
		Voto unVoto = new Voto("Mauricio Macri", "Cambiemos");
		
		Assert.assertEquals("Mauricio Macri", unVoto.getNombreCandidato());
	}

	@Test
	public void partidoEsCorrecto(){
		
		Voto unVoto = new Voto("Mauricio Macri", "Cambiemos");
		
		Assert.assertEquals("Cambiemos", unVoto.getNombrePartido());
	}
}
