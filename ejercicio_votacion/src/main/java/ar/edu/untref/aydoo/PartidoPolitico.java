package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PartidoPolitico {
	
	private String nombre;
	private List<Candidato> candidatos = new LinkedList<Candidato>();
	private int cantidadVotos;
	
	public PartidoPolitico(String nombre, List<Candidato> candidatos){
		this.nombre = nombre;
		this.candidatos = candidatos;
	}
	
	public String getNombrePartido(){
		return this.nombre;
	}
	
	public List<Candidato> getListaCandidatos(){
		return this.candidatos;
	}
	
	public Candidato getCandidato(int posicion){
		return this.candidatos.get(posicion);
	}
	
	public int getCantidadVotos(){
		return this.cantidadVotos;
	}
	
	public void sumarVoto(){
		this.cantidadVotos++;
	}
	
	public Candidato CandidatoGanador(){
		
		Candidato candidatoGanador = candidatos.get(0);
		
		Iterator<Candidato> iteradorcandidatos = candidatos.iterator();
		while(iteradorcandidatos.hasNext()){
			Candidato candidatoActual = iteradorcandidatos.next();
			if(candidatoGanador.getCantidadDeVotos() < candidatoActual.getCantidadDeVotos()){
				candidatoGanador = candidatoActual;
			}
		}
		
		return candidatoGanador;
	}
}
