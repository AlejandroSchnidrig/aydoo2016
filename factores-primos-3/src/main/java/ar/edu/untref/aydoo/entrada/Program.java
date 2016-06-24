package ar.edu.untref.aydoo.entrada;

import java.io.IOException;

import ar.edu.untref.aydoo.dominio.NumeroNegativoException;
import ar.edu.untref.aydoo.salida.Presentacion;

public class Program {
	
	public static void main(String[] args) throws NumeroNegativoException, NoParametrosException, IOException, NoNumeroException{
		Presentacion presentacion = new Presentacion();
		presentacion.presentar(args);
	}

}
