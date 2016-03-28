package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {

	private HacedorDeTe unHacedorDeTe = new HacedorDeTe();
	private HacedorDeTeChino unHacedorDeTeChino = new HacedorDeTeChino();
	private Lechero unLechero = new Lechero();
	
	public Vaso prepararTeConLeche(Vaso unVaso, int cantidadTe, int cantidadLeche){
		
		unHacedorDeTe.ponerNcantidadDeTe(unVaso, cantidadTe);
		unLechero.ponerNCantidadDeLeche(unVaso, cantidadLeche);
		
		return unVaso;
	}
	
	public Vaso prepararTeChino(Vaso unVaso, int cantidadTeChino){
		
		unHacedorDeTeChino.ponerNCantidadDeTeChino(unVaso, cantidadTeChino);
		
		return unVaso;
	}
}
