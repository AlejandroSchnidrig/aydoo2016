package ar.edu.untref.aydoo.entrada;

@SuppressWarnings("serial")
public class NoParametrosException extends Exception {

	private static String msg = "Debe ingresar al menos un parametro";

	public NoParametrosException() {
		super(msg);
	}

}
