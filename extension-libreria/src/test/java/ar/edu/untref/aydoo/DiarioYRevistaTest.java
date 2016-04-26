package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class DiarioYRevistaTest {

	@Test
	public void elPrecioDevueltoDeUnDiarioYRevistaNoIncluyeIVA() {

		BigDecimal precioSinIVA = new BigDecimal("15.00");
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", precioSinIVA, Periodicidad.DIARIA);

		BigDecimal precioSinIVAObtenido = diarioPagina12.getPrecio();

		Assert.assertEquals(precioSinIVA, precioSinIVAObtenido);

	}

	@Test
	public void DescripcionDeUnDiarioYRevistaEsCorrecto() {

		BigDecimal precioSinIVA = new BigDecimal("15.00");
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", precioSinIVA, Periodicidad.DIARIA);

		Assert.assertEquals("Pagina 12", diarioPagina12.getDescripcion());

	}

	@Test
	public void PeriocidadDeUnDiarioYRevistaEsCorrecto() {

		BigDecimal precioSinIVA = new BigDecimal("15.00");
		DiarioYRevista diarioPagina12 = new DiarioYRevista("Pagina 12", precioSinIVA, Periodicidad.DIARIA);

		Assert.assertEquals(Periodicidad.DIARIA, diarioPagina12.getPeriodicidad());

	}

}
