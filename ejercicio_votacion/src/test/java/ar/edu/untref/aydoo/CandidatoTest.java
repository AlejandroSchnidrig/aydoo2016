package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;


public class CandidatoTest {
	
	@Test
	public void NombreYApellidoEsCorrecto(){
		
		Candidato unCandidato = new Candidato("Nicolas Del Caño", "Partido de los Trabajadores Socialistas");
		
		Assert.assertEquals("Nicolas Del Caño", unCandidato.getNombre());
	}
	
	@Test
	public void PartidoPoliticoEsCorrecto(){
		
		Candidato unCandidato = new Candidato("Daniel Scioli", "Frente Para la Victoria");
		
		Assert.assertEquals("Frente Para la Victoria", unCandidato.getPartidoPolitico());
	}
	
	@Test
	public void CandidatoSumaPuntosCorrectamente(){
		
		Candidato unCandidato = new Candidato("Daniel Scioli", "Frente Para la Victoria");
		unCandidato.sumarVoto();
		unCandidato.sumarVoto();
		
		Assert.assertEquals(2, unCandidato.getCantidadDeVotos());
		
	}

}
