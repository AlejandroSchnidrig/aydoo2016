package ar.edu.untref.aydoo.dominio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Formateador {

	Map<String, Formato> formatos;

	public Formateador() {
		this.formatos = new HashMap<String, Formato>();
		this.formatos.put("", new FormatoPretty());
		this.formatos.put("--format=pretty", new FormatoPretty());
		this.formatos.put("--format=quiet", new FormatoQuiet());
	}

	public String aplicarFormato(String formato, List<Integer> numerosOrdenados) {

		String FormatoActual = this.formatos.get("--format=pretty").darFormato(numerosOrdenados);

		if (formato.startsWith("--f")) {
			FormatoActual = formatos.get(formato).darFormato(numerosOrdenados);
			return FormatoActual;
		}
		return FormatoActual;
	}
}