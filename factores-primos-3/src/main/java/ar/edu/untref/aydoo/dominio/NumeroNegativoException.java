package ar.edu.untref.aydoo.dominio;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception {
	
	private static String msg = "No puede ingresar numeros negativos o cero";
	
	public NumeroNegativoException(){
		super(msg);
	}

}
