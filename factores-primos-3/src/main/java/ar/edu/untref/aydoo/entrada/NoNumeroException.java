package ar.edu.untref.aydoo.entrada;

@SuppressWarnings("serial")
public class NoNumeroException extends Exception {
	
	private static String msg = "Debe ingresar un numero como parametro obligatorio";
	
	public NoNumeroException(){
		super(msg);
	}

}
