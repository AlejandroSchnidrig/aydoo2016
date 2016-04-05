package ar.edu.untref.aydoo;

public class Voto {

	private String nombreCandidato;
	private String nombrePartido;
	
	public Voto(String nombre, String partido){
		this.nombreCandidato = nombre;
		this.nombrePartido = partido;
	}
	
	public String getNombreCandidato(){
		return this.nombreCandidato;
	}
	
	public String getNombrePartido(){
		return this.nombrePartido;
	}
	
}
