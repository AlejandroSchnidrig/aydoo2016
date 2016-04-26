package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void alquilerPorDias() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);

		BigDecimal esperado = new BigDecimal("150.00");

		Assert.assertEquals(esperado, unLibro.alquilerPorDias(15));
	}

	@Test
	public void alquilerPorMes() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);

		BigDecimal esperado = new BigDecimal("200.00");

		Assert.assertEquals(esperado, unLibro.alquilerMensual(2));
	}

	@Test
	public void alquilerPorCuatrimestral() {
		BigDecimal precio = new BigDecimal("100.00");
		Libro unLibro = new Libro("El Quijote", precio);

		BigDecimal esperado = new BigDecimal("180.00");

		Assert.assertEquals(esperado, unLibro.alquilercuatrimestral(1));
	}

}
