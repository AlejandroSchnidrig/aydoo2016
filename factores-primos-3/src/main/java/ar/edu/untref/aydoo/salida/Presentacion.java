package ar.edu.untref.aydoo.salida;

import java.io.IOException;
import java.util.List;

import ar.edu.untref.aydoo.dominio.Calculadora;
import ar.edu.untref.aydoo.dominio.Formateador;
import ar.edu.untref.aydoo.dominio.NumeroNegativoException;
import ar.edu.untref.aydoo.dominio.Ordenador;
import ar.edu.untref.aydoo.entrada.NoNumeroException;
import ar.edu.untref.aydoo.entrada.NoParametrosException;
import ar.edu.untref.aydoo.entrada.VerificadorDeParametros;

public class Presentacion {

	private VerificadorDeParametros verificador;
	private Calculadora calculadora;
	private Ordenador ordenador;
	private Formateador formateador;
	private Salida salida;

	public Presentacion() {
		this.verificador = new VerificadorDeParametros();
		this.calculadora = new Calculadora();
		this.ordenador = new Ordenador();
		this.formateador = new Formateador();
		this.salida = new Salida();
	}

	public void presentar(String[] parametros) throws NumeroNegativoException, NoParametrosException, IOException, NoNumeroException {

		String resultado = "";
		List<Integer> numerosOrdenados;

		verificador.verificarParametros(parametros);

		int numero = this.verificador.getNumero();
		String orden = this.verificador.getOrden();
		String formato = this.verificador.getFormato();
		String ruta = this.verificador.getRuta();

		List<Integer> numeros = this.calculadora.calcularFactoresPrimos(numero);

		numerosOrdenados = this.ordenador.aplicarOrden(orden, numeros);
		resultado = this.formateador.aplicarFormato(formato, numerosOrdenados);

		if (!verificador.Imprime()) {
			this.salida.salidaPorPantalla(resultado);
		} else {
			this.salida.SalidaPorArchivo(resultado, ruta);
		}

	}

}