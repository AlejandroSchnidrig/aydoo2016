package ar.edu.untref.aydoo;

public class Cafetero {
	
	public Vaso ponerNCantidadDeCafe(Vaso unVaso, int cantidadCafe){
		
		int nuevaCapacidad;
		
		if (cantidadCafe > unVaso.getCapacidad()){
			throw new Error ("capacidad del vaso excedida");
		}else if(cantidadCafe <= 0){
			throw new Error ("cantidad incorrecta");
		}else{
			unVaso.setCantidadBebida(cantidadCafe);
			nuevaCapacidad = unVaso.getCapacidad() - unVaso.getCantidadBebida();
			unVaso.setCapacidad(nuevaCapacidad);
		}
		
		return unVaso;
	}

}
