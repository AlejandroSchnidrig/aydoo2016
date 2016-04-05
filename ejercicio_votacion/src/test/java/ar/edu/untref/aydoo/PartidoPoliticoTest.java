package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartidoPoliticoTest {
	
	private PartidoPolitico UnidosPorUnaNuevaAlternativa;
	
	private Candidato sergioMassa;
	private Candidato joseManuelDeLaSota;
	
	private List<Candidato> candidatos = new LinkedList<Candidato>();
	
	@Before
	public void inicializar(){
		
		sergioMassa = new Candidato("Sergio Massa", "Unidos por una Nueva Alternativa");
		joseManuelDeLaSota = new Candidato("Jose Manuel De La Sota", "Unidos por una Nueva Alternativa");
		
		candidatos.add(sergioMassa);
		candidatos.add(joseManuelDeLaSota);
		
		UnidosPorUnaNuevaAlternativa = new PartidoPolitico("Unidos por una Nueva Alternativa", candidatos);
		
	}
	
	@Test
	public void nombreDelPartidoEsCorrecto(){
		
		Assert.assertEquals("Unidos por una Nueva Alternativa",UnidosPorUnaNuevaAlternativa.getNombrePartido());
	}
	
	@Test
	public void candidatosDelPartidoSonlosCorrectos(){
		
		Assert.assertEquals("Sergio Massa", UnidosPorUnaNuevaAlternativa.getCandidato(0).getNombre());
		Assert.assertEquals("Jose Manuel De La Sota", UnidosPorUnaNuevaAlternativa.getCandidato(1).getNombre());
	}
	
	@Test
	public void ElPartidoSumanUnVoto(){
		
		UnidosPorUnaNuevaAlternativa.sumarVoto();
		
		Assert.assertEquals(1, UnidosPorUnaNuevaAlternativa.getCantidadVotos());
		
	}
	
	@Test
	public void candidatoGanadorDelPartidoEsCorrecto(){
		
		sergioMassa.sumarVoto();
		sergioMassa.sumarVoto();
		sergioMassa.sumarVoto();
		joseManuelDeLaSota.sumarVoto();
		joseManuelDeLaSota.sumarVoto();
		
		Assert.assertEquals("Sergio Massa",UnidosPorUnaNuevaAlternativa.CandidatoGanador().getNombre());
	}
	
	
	

}
