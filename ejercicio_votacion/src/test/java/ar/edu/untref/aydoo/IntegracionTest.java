package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegracionTest {
	
	//votos
	private Voto votoMacri;
	private Voto votoScioli;
	private Voto votoDelCaño;
	private Voto votoCarrio;
	
	//cordoba
	private Candidato macriCordoba;
	private Candidato scioliCordoba;
	private Candidato delCañoCordoba;
	private Candidato carrioCordoba;
	
	private PartidoPolitico cambiemosCordoba;
	private PartidoPolitico frenteParaLaVictoriaCordoba;
	private PartidoPolitico trabajadoresSocialistasCordoba;
	
	private Provincia provinciaCordoba;
	
	private List<PartidoPolitico> partidosCordoba = new LinkedList<PartidoPolitico>();
	
	private List<Candidato> candidatosCambiemosCordoba = new LinkedList<Candidato>();
	private List<Candidato> candidatosFrenteParaLaVictoriaCordoba = new LinkedList<Candidato>();
	private List<Candidato> candidatosTrabajadoresSocialistasCordoba = new LinkedList<Candidato>();
	
	//BsAs
	private Candidato macriBsAs;
	private Candidato scioliBsAs;
	private Candidato delCañoBsAs;
	private Candidato carrioBsAs;
	
	private PartidoPolitico cambiemosBsAs;
	private PartidoPolitico frenteParaLaVictoriaBsAs;
	private PartidoPolitico trabajadoresSocialistasBsAs;
	
	private Provincia provinciaBsAs;
	
	private List<PartidoPolitico> partidosBsAs = new LinkedList<PartidoPolitico>();
	
	private List<Candidato> candidatosCambiemosBsAs = new LinkedList<Candidato>();
	private List<Candidato> candidatosFrenteParaLaVictoriaBsAs= new LinkedList<Candidato>();
	private List<Candidato> candidatosTrabajadoresSocialistasBsAs= new LinkedList<Candidato>();
	
	private List<Provincia> provincias = new LinkedList<Provincia>();
	private Resultados misResultados;
	
	@Before
	public void inicializar(){
		
		//votos
		votoMacri = new Voto("Mauricio Macri", "Cambiemos");
		votoScioli = new Voto("Daniel Scioli", "Frente Para la Victoria");
		votoDelCaño = new Voto("Nicolas Del Caño","Partido de los Trabajadores Socialistas");
		votoCarrio = new Voto("Elisa Carrio", "Cambiemos");
		
		//Cordoba
		macriCordoba = new Candidato("Mauricio Macri", "Cambiemos");
		scioliCordoba = new Candidato("Daniel Scioli", "Frente Para la Victoria");
		delCañoCordoba = new Candidato("Nicolas Del Caño", "Partido de los Trabajadores Socialistas");
		carrioCordoba = new Candidato("Elisa Carrio", "Cambiemos");
		
		candidatosCambiemosCordoba.add(macriCordoba);
		candidatosCambiemosCordoba.add(carrioCordoba);
		candidatosFrenteParaLaVictoriaCordoba.add(scioliCordoba);
		candidatosTrabajadoresSocialistasCordoba.add(delCañoCordoba);
		
		cambiemosCordoba = new PartidoPolitico("Cambiemos",candidatosCambiemosCordoba);
		frenteParaLaVictoriaCordoba = new PartidoPolitico("Frente Para la Victoria",candidatosFrenteParaLaVictoriaCordoba);
		trabajadoresSocialistasCordoba = new PartidoPolitico("Partido de los Trabajadores Socialistas", candidatosTrabajadoresSocialistasCordoba);
		
		partidosCordoba.add(cambiemosCordoba);
		partidosCordoba.add(frenteParaLaVictoriaCordoba);
		partidosCordoba.add(trabajadoresSocialistasCordoba);
		
		provinciaCordoba = new Provincia("Cordoba",partidosCordoba);
		
		//BsAs
		macriBsAs = new Candidato("Mauricio Macri", "Cambiemos");
		scioliBsAs = new Candidato("Daniel Scioli", "Frente Para la Victoria");
		delCañoBsAs = new Candidato("Nicolas Del Caño", "Partido de los Trabajadores Socialistas");
		carrioBsAs = new Candidato("Elisa Carrio", "Cambiemos");
		
		candidatosCambiemosBsAs.add(macriBsAs);
		candidatosCambiemosBsAs.add(carrioBsAs);
		candidatosFrenteParaLaVictoriaBsAs.add(scioliBsAs);
		candidatosTrabajadoresSocialistasBsAs.add(delCañoBsAs);
		
		cambiemosBsAs = new PartidoPolitico("Cambiemos",candidatosCambiemosBsAs);
		frenteParaLaVictoriaBsAs = new PartidoPolitico("Frente Para la Victoria",candidatosFrenteParaLaVictoriaBsAs);
		trabajadoresSocialistasBsAs = new PartidoPolitico("Partido de los Trabajadores Socialistas", candidatosTrabajadoresSocialistasBsAs);
		
		partidosBsAs.add(cambiemosBsAs);
		partidosBsAs.add(frenteParaLaVictoriaBsAs);
		partidosBsAs.add(trabajadoresSocialistasBsAs);
		
		provinciaBsAs = new Provincia("BsAs",partidosBsAs);
		
		//objeto Resultado
		provincias.add(provinciaCordoba);
		provincias.add(provinciaBsAs);
		misResultados = new Resultados ("Primarias Presidenciales 2015", provincias);
		
	}
	
	@Test
	public void CambiemosYMacriSumanTresVotoEnCordoba(){
		
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoDelCaño);
		
		Assert.assertEquals(3, macriCordoba.getCantidadDeVotos());
		Assert.assertEquals(3, cambiemosCordoba.getCantidadVotos());
	}
	
	@Test
	public void FPVYScioliSumanUnVotoEnCordoba(){
		
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoDelCaño);
		
		Assert.assertEquals(1, scioliCordoba.getCantidadDeVotos());
		Assert.assertEquals(1, frenteParaLaVictoriaCordoba.getCantidadVotos());
	}

	@Test
	public void ConsultarPartidoGanadorDeCordoba(){
		
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoCarrio);
		
		Assert.assertEquals("Cambiemos", misResultados.getPartidoGanadorDeLaProvincia(provinciaCordoba));
	}
	
	@Test
	public void CandidatoGanadorDeCordobaEsCarrio(){
			
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoCarrio);
		provinciaCordoba.votar(votoCarrio);
		provinciaCordoba.votar(votoCarrio);
		provinciaCordoba.votar(votoCarrio);
		
		Assert.assertEquals("Elisa Carrio", misResultados.getCandidatoGanadorDeLaProvincia(provinciaCordoba));
	}
	
	@Test
	public void CandidatoGanadorDeCordobaEsMacri(){
			
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoCarrio);
		provinciaCordoba.votar(votoCarrio);
		
		
		Assert.assertEquals("Mauricio Macri", misResultados.getCandidatoGanadorDeLaProvincia(provinciaCordoba));
	}
	
	@Test
	public void ScioliyFVPSumanDosVotoEnBsAs(){
		
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		
		Assert.assertEquals(2, scioliBsAs.getCantidadDeVotos());
		Assert.assertEquals(2, frenteParaLaVictoriaBsAs.getCantidadVotos());
	}
	
	@Test
	public void consultarPartidoGanadorEnBsAs(){
		
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoDelCaño);
		
		Assert.assertEquals("Frente Para la Victoria", misResultados.getPartidoGanadorDeLaProvincia(provinciaBsAs));
		
	}
	
	@Test
	public void consultarCandidatoGanadorEnBsAs(){
		
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoDelCaño);
		
		Assert.assertEquals("Daniel Scioli", misResultados.getCandidatoGanadorDeLaProvincia(provinciaBsAs));
		
	}
	
	@Test
	public void TotalDeVotosAnivelNacionalSon7ParaDelCaño(){
		
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoCarrio);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoCarrio);
		
		Assert.assertEquals(7, misResultados.getCantidadDeVotosTotalesDeUnCandidato(delCañoCordoba));
	}	
	
	
	@Test
	public void GanadorANivelNacionalEsDelCaño(){
		
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoDelCaño);
		provinciaCordoba.votar(votoMacri);
		provinciaCordoba.votar(votoScioli);
		provinciaCordoba.votar(votoCarrio);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoDelCaño);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoMacri);
		provinciaBsAs.votar(votoScioli);
		provinciaBsAs.votar(votoCarrio);
		
		Assert.assertEquals("Nicolas Del Caño", misResultados.getCandidatoGanadorANivelNacional());
	}	
}
	