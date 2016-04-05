package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Provincia {
	
	private String nombre;
	private List<PartidoPolitico> partidos = new LinkedList<PartidoPolitico>();
	
	public Provincia(String nombre, List<PartidoPolitico> partidos){
		this.nombre = nombre;
		this.partidos = partidos;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public List<PartidoPolitico> getListaPartidosPoliticos(){
		return this.partidos;
	}
	
	public PartidoPolitico getPartidoPolitico(int posicion){
		return this.partidos.get(posicion);
	}
	
	public void votar(Voto unVoto){
		
		String nombrePartido = unVoto.getNombrePartido();
		String nombreCandidato = unVoto.getNombreCandidato();
		
		Iterator<PartidoPolitico> iteradorPartidos = partidos.iterator();
		while(iteradorPartidos.hasNext()){
			PartidoPolitico partido = iteradorPartidos.next();
			if(partido.getNombrePartido().equals(nombrePartido)){
				partido.sumarVoto();
			}
			
			List<Candidato> candidatos = partido.getListaCandidatos();
			Iterator<Candidato> iteratorCandidato = candidatos.iterator();
			while(iteratorCandidato.hasNext()){
				Candidato candidato = iteratorCandidato.next();
				if(candidato.getNombre().equals(nombreCandidato)){
					candidato.sumarVoto();
				}
			}
		}
		
	}
	
	public PartidoPolitico PartidoGanador(){
		
		PartidoPolitico partidoGanador = partidos.get(0);
		
		Iterator<PartidoPolitico> iteradorPartidos = partidos.iterator();
		while(iteradorPartidos.hasNext()){
			PartidoPolitico partidoActual = iteradorPartidos.next();
			if(partidoGanador.getCantidadVotos() < partidoActual.getCantidadVotos()){
				partidoGanador = partidoActual;
			}
		}
		
		return partidoGanador;
	}
	
	public Candidato CandidatoGanador(){
		
		Candidato candidatoGanador = partidos.get(0).CandidatoGanador();
		
		Iterator<PartidoPolitico> iteradorPartidos = partidos.iterator();
		while(iteradorPartidos.hasNext()){
			PartidoPolitico partidoActual = iteradorPartidos.next();
			Candidato candidatoActual = partidoActual.CandidatoGanador();
			if(candidatoActual.getCantidadDeVotos() > candidatoGanador.getCantidadDeVotos()){
				candidatoGanador = candidatoActual;
			}
		}
		
		return candidatoGanador;
		
	}

}
