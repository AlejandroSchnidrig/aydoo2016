package ar.edu.untref.aydoo;

public class Vaso {
	
	private int capacidad;  
	private int cantidadBebida;
	private int cantidadleche;
	private int cucharadasAzucar;
	
	public Vaso(){
		this.capacidad = 350;
		this.cantidadBebida = 0;
		this.cantidadleche = 0;
		this.cucharadasAzucar = 0;
	}
	
	public int getCapacidad(){
		return this.capacidad;
	}
	
	public int getCantidadBebida(){
		return this.cantidadBebida;
	}
	
	public int getCantidadLeche(){
		return this.cantidadleche;
	}
	
	public int getCucharadasAzucar(){
		return this.cucharadasAzucar;
	}
	
	public void setCantidadBebida(int nuevaCantidad){
		this.cantidadBebida = nuevaCantidad;
	}
	
	public void setCantidadLeche(int nuevaCantidad){
		this.cantidadleche = nuevaCantidad;
	}
	
	public void setCucharadasAzucar(int nuevaCantidad){
		this.cucharadasAzucar = nuevaCantidad;
	}
	
	public void setCapacidad(int nuevaCantidad){
		this.capacidad = nuevaCantidad;
	}
}
