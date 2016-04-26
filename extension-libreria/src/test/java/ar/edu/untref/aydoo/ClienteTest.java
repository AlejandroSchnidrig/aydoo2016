package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void dosClientesSonElMismoSiTienenIgualNombreYApellido() {

		Cliente cliente1 = new Cliente("Leandro", "Garcia", "Cueli 1350");
		Cliente cliente2 = new Cliente("Leandro", "Garcia", "Cueli 1350");

		boolean sonElMismoCliente = cliente1.equal(cliente2);

		Assert.assertTrue(sonElMismoCliente);

	}

	@Test
	public void NombreDelClienteEsCorrecto() {

		Cliente cliente1 = new Cliente("Leandro", "Garcia", "Cueli 1350");

		Assert.assertEquals("Leandro", cliente1.getNombre());

	}

	@Test
	public void ApellidoDelClienteEsCorrecto() {

		Cliente cliente1 = new Cliente("Leandro", "Garcia", "Cueli 1350");

		Assert.assertEquals("Garcia", cliente1.getApellido());

	}

	@Test
	public void DireccionDelClienteEsCorrecto() {

		Cliente cliente1 = new Cliente("Leandro", "Garcia", "Cueli 1350");

		Assert.assertEquals("Cueli 1350", cliente1.getDireccion());

	}
}
