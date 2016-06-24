package ar.edu.untref.aydoo.salida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salida {

	public void salidaPorPantalla(String salida) {
		System.out.println(salida);
	}

	public void SalidaPorArchivo(String resultado, String ruta) throws IOException {
		File archivo = new File(ruta);
		BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
		escritor.write(resultado);
		escritor.close();
	}

}
