package ar.edu.untref.aydoo.entrada;

public class VerificadorDeParametros {
	
	private String formato = "pretty";
	private String orden = "asc";
	private int numero = 0;
	
	private String nombreDeArchivo = null;
	private boolean imprime = false;

	public void verificarParametros(String args[]) throws NoParametrosException, NoNumeroException {
		
		if(args.length == 0){
			throw new NoParametrosException();
		}
		
		for (String datos : args) {
			if (datos.contains("--format=")) {
				this.formato = datos.toLowerCase();
			} else if (datos.contains("--sort:")) {
				this.orden = datos.toLowerCase();
			} else if (datos.contains("--output-file=")) {
				String[] ruta = datos.split("=");
				this.nombreDeArchivo = ruta[1].toLowerCase();
				this.imprime = true;
			}else{
				numero = Integer.parseInt(datos);
			}
			
			if(numero == 0){
				throw new NoNumeroException();
			}
		}
	}

	public String getOrden() {
		return this.orden;
	}
	
	public String getFormato() {
		return this.formato;
	}

	public String getRuta() {
		return this.nombreDeArchivo;
	}

	public boolean Imprime() {
		return this.imprime;
	}
	
	public int getNumero(){
		return this.numero;
	}
		
}
			
		
