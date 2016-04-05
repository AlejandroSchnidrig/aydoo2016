package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Resultados {
	
	private String nombre;
	private List<Provincia> provincias = new LinkedList<Provincia>();
	
	public Resultados(String nombre,List<Provincia> provincias){
		this.nombre = nombre;
		this.provincias = provincias;
	}
	
	public String getPartidoGanadorDeLaProvincia(Provincia unaProvincia){
		return unaProvincia.PartidoGanador().getNombrePartido();
	}
	
	public String getCandidatoGanadorDeLaProvincia(Provincia unaProvincia){
		return unaProvincia.CandidatoGanador().getNombre();
	}
	
	public int getCantidadDeVotosTotalesDeUnCandidato(Candidato candidato){
		
		int cantidadTotalDeVotos = 0;
		
		Iterator<Provincia> iteradorProvincias = provincias.iterator();
		while(iteradorProvincias.hasNext()){
			Provincia provinciaActual = iteradorProvincias.next();
			List<PartidoPolitico> partidos = provinciaActual.getListaPartidosPoliticos();
			Iterator<PartidoPolitico> iteradorPartido = partidos.iterator();
			while(iteradorPartido.hasNext()){
				PartidoPolitico partidoActual = iteradorPartido.next();
				List<Candidato> candidatos = partidoActual.getListaCandidatos();
				Iterator<Candidato> iteradorCandidato = candidatos.iterator();
				while(iteradorCandidato.hasNext()){
					Candidato candidatoActual = iteradorCandidato.next();
					if(candidatoActual.getNombre().equals(candidato.getNombre())){
						cantidadTotalDeVotos += candidatoActual.getCantidadDeVotos();
					}
				}
			}
		}	
		return cantidadTotalDeVotos;
	}
	
	public String getCandidatoGanadorANivelNacional(){
		
		Candidato candidatoGanador = provincias.get(0).getPartidoPolitico(0).getCandidato(0);
		
		Iterator<Provincia> iteradorProvincias = provincias.iterator();
		while(iteradorProvincias.hasNext()){
			Provincia provinciaActual = iteradorProvincias.next();
			List<PartidoPolitico> partidos = provinciaActual.getListaPartidosPoliticos();
			Iterator<PartidoPolitico> iteradorPartido = partidos.iterator();
			while(iteradorPartido.hasNext()){
				PartidoPolitico partidoActual = iteradorPartido.next();
				List<Candidato> candidatos = partidoActual.getListaCandidatos();
				Iterator<Candidato> iteradorCandidato = candidatos.iterator();
				while(iteradorCandidato.hasNext()){
					Candidato candidatoActual = iteradorCandidato.next();
					if(this.getCantidadDeVotosTotalesDeUnCandidato(candidatoActual) > this.getCantidadDeVotosTotalesDeUnCandidato(candidatoGanador)){
						candidatoGanador = candidatoActual;
					}
				}
			}
		}
		
		return candidatoGanador.getNombre();
	}
	
	public String getNombre(){
		return this.nombre;
	}

}
