package ar.edu.untref.aydoo;

public class Azucarero {
	
	public Vaso ponerNCucharadasDeAzucar(Vaso unVaso, int cantidadDeCucharadas){
		
		if(cantidadDeCucharadas < 0){
			throw new Error ("cantidad incorrecta");
		}else{
			unVaso.setCucharadasAzucar(cantidadDeCucharadas);
			return unVaso;
		}
	}

}
