package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {
	
	private Cafetero unCafetero = new Cafetero();
	private Lechero unLechero = new Lechero();
	
	public Vaso prepararCafeconLeche(Vaso unVaso, int cantidadCafe, int cantidadLeche){
		
		unCafetero.ponerNCantidadDeCafe(unVaso, cantidadCafe);
		unLechero.ponerNCantidadDeLeche(unVaso, cantidadLeche);
		
		return unVaso;
		
	}

}
