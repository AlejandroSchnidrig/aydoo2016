package ar.edu.untref.aydoo;

public class HacedorDeTeChino {
	
	public Vaso ponerNCantidadDeTeChino(Vaso unVaso, int cantidadTeChino){
		

		int nuevaCapacidad;
		
		if (cantidadTeChino > unVaso.getCapacidad()){
			throw new Error ("capacidad del vaso excedida");
		}else if(cantidadTeChino <= 0){
			throw new Error ("cantidad incorrecta");
		}else{
			unVaso.setCantidadBebida(cantidadTeChino);
			nuevaCapacidad = unVaso.getCapacidad() - unVaso.getCantidadBebida();
			unVaso.setCapacidad(nuevaCapacidad);
		}
		
		return unVaso;
	}

}
