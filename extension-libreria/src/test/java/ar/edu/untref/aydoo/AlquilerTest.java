package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerTest {

	@Test
	public void alquilerPorDias() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);
		Alquiler miAlquiler = new Alquiler("Alquila El Quijote 10 dias", unLibro.alquilerPorDias(10));

		BigDecimal esperado = new BigDecimal("100.00");

		Assert.assertEquals(esperado, miAlquiler.getPrecio());
	}

	@Test
	public void alquilerPorMes() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);
		Alquiler miAlquiler = new Alquiler("Alquila El Quijote 1 mes", unLibro.alquilerMensual(1));

		BigDecimal esperado = new BigDecimal("200.00");

		Assert.assertEquals(esperado, miAlquiler.getPrecio());
	}

	@Test
	public void alquilerPorCuatrimestral() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);
		Alquiler miAlquiler = new Alquiler("Alquila El Quijote 1 cuatrimestre", unLibro.alquilercuatrimestral(1));

		BigDecimal esperado = new BigDecimal("180.00");

		Assert.assertEquals(esperado, miAlquiler.getPrecio());
	}

}
