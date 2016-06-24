package ar.edu.untref.aydoo.dominio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ordenador {

	Map<String, Orden> ordenes;

	public Ordenador() {
		this.ordenes = new HashMap<String, Orden>();
		this.ordenes.put("", new OrdenAscendente());
		this.ordenes.put("--sort:asc", new OrdenAscendente());
		this.ordenes.put("--sort:des", new OrdenDescendente());
	}

	public List<Integer> aplicarOrden(String orden, List<Integer> numeros) {

		List<Integer> ordenActual = this.ordenes.get("--sort:asc").ordenar(numeros);

		if (orden.startsWith("--s")) {
			ordenActual = ordenes.get(orden).ordenar(numeros);
			return ordenActual;
		}
		return ordenActual;
	}
}