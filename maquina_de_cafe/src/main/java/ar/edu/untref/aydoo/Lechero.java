package ar.edu.untref.aydoo;

public class Lechero {
	
	public Vaso ponerNCantidadDeLeche(Vaso unVaso, int cantidadLeche){
		
		int nuevaCapacidad;
		
		if (cantidadLeche > unVaso.getCapacidad()){
			throw new Error ("capacidad del vaso excedida");
		}else if(cantidadLeche <= 0){
			throw new Error ("cantidad incorrecta");
		}else{
			unVaso.setCantidadLeche(cantidadLeche);
			nuevaCapacidad = unVaso.getCapacidad() - unVaso.getCantidadLeche();
			unVaso.setCapacidad(nuevaCapacidad);
		}
		
		return unVaso;
	}

}
