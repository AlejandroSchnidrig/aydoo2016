package ar.edu.untref.aydoo;

public class Candidato {
	
	private String nombreYApellido;
	private String partidoPolitico;
	private int cantidadDeVotos;
	
	public Candidato(String nombre, String partido){
		this.nombreYApellido = nombre;
		this.partidoPolitico = partido;
	}
	
	public String getNombre(){
		return this.nombreYApellido;
	}
	
	public String getPartidoPolitico(){
		return this.partidoPolitico;
	}

	public void sumarVoto() {
		this.cantidadDeVotos++;
		}
	
	public int getCantidadDeVotos(){
		return this.cantidadDeVotos;
	}
}
