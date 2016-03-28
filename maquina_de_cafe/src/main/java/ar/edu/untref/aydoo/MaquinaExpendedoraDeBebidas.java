package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	private HacedorDeCafeConLeche unHacedorDeCafeConLeche = new HacedorDeCafeConLeche();
	private HacedorDeTeConLeche unHacedorDeTeConLeche = new HacedorDeTeConLeche();
	private Azucarero unAzucarero = new Azucarero();
	
	public Vaso prepararCafeConLecheConNAzucar(Vaso unVaso, int cantidadCafe, int cantidadLeche, int cantidadDeCucharadas){
		
		unHacedorDeCafeConLeche.prepararCafeconLeche(unVaso, cantidadCafe, cantidadLeche);
		unAzucarero.ponerNCucharadasDeAzucar(unVaso, cantidadDeCucharadas);
		
		return unVaso;
	}
	
	public Vaso prepararTeConLecheConNAzucar(Vaso unVaso, int cantidadTe, int cantidadLeche, int cantidadDeCucharadas){
		
		unHacedorDeTeConLeche.prepararTeConLeche(unVaso, cantidadTe, cantidadLeche);
		unAzucarero.ponerNCucharadasDeAzucar(unVaso, cantidadDeCucharadas);
		
		return unVaso;
	}
	
	public Vaso prepararTeChino(Vaso unVaso, int cantidadTeChino, int cantidadDeCucharadas){
		
		unHacedorDeTeConLeche.prepararTeChino(unVaso, cantidadTeChino);
		unAzucarero.ponerNCucharadasDeAzucar(unVaso, cantidadDeCucharadas);
		
		return unVaso;
	}

}
