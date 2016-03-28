package ar.edu.untref.aydoo;

public class HacedorDeTe {
	
	public Vaso ponerNcantidadDeTe(Vaso unVaso, int cantidadTe){
		
		int nuevaCapacidad;
		
		if (cantidadTe > unVaso.getCapacidad()){
			throw new Error ("capacidad del vaso excedida");
		}else if(cantidadTe <= 0){
			throw new Error ("cantidad incorrecta");
		}else{
			unVaso.setCantidadBebida(cantidadTe);
			nuevaCapacidad = unVaso.getCapacidad() - unVaso.getCantidadBebida();
			unVaso.setCapacidad(nuevaCapacidad);
		}
		
		return unVaso;
	}

}
