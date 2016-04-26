package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void montoACobrarParaClienteConCompraSinProductosEsCero() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Gabriel", "Raponi", "Almafuerte 3456");
		Compra compra = new Compra(Mes.ABRIL, cliente);
		libreria.agregarCompra(compra);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("0.00");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ABRIL, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void montoACobrarParaClienteSinCompraEnEneroEsCero() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Luis", "Segura", "Seneca 1220");
		Compra compra = new Compra(Mes.JULIO, cliente);
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", new java.math.BigDecimal("12.00"),
				Periodicidad.DIARIA);
		compra.agregarProducto(diarioPagina12);
		libreria.agregarCompra(compra);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("0.00");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calculoDeMontoACobrarParaClienteConDosComprasEnUnMes() {

		Cliente cliente = new Cliente("Diego", "Lopez", "Aristoteles 1829");
		Libreria libreria = new Libreria("Gamma");
		libreria.agregarCompra(generarCompraEjemplo2Tarea(cliente));
		libreria.agregarCompra(generarCompraEnEnero(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("136.10");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calculoDeMontoACobrarEnUnMesConDosClientesConCompra() {

		Cliente clienteDiego = new Cliente("Diego", "Lopez", "Aristoteles 1829");
		Cliente clienteLucas = new Cliente("Lucas", "Vazquez", "Sudamerica 1051");
		Libreria libreria = new Libreria("Gamma");
		libreria.agregarCompra(generarCompraEjemplo2Tarea(clienteDiego));
		libreria.agregarCompra(generarCompraEnEnero(clienteLucas));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("44.00");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, clienteDiego);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEjemplo1Tarea() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Juan", "Lopez", "Bonifacini 3950");
		libreria.agregarCompra(generarCompraEjemplo1Tarea(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("92.10");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.AGOSTO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEjemplo2Tarea() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Maria", "Suarez", "Patricios 1420");
		libreria.agregarCompra(generarCompraEjemplo2Tarea(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("44.00");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEnNoviembre() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Maria", "Suarez", "Patricios 1420");
		libreria.agregarCompra(generarCompraEnNoviembre(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("312.10");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.NOVIEMBRE, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEnDiciembre() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Juan", "Lopez", "Bonifacini 3950");
		libreria.agregarCompra(generarCompraEnDiciembre(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("244.00");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.DICIEMBRE, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEnMayo() {

		Libreria libreria = new Libreria("Gamma");
		Cliente cliente = new Cliente("Maria", "Suarez", "Patricios 1420");
		libreria.agregarCompra(generarCompraEnMayo(cliente));
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("272.10");

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.MAYO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	private Compra generarCompraEjemplo1Tarea(Cliente cliente) {

		Compra compra = new Compra(Mes.AGOSTO, cliente);
		Producto libroElHobbit = new Producto("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00"),
				Periodicidad.MENSUAL);
		compra.agregarProducto(revistaElGrafico);

		return compra;

	}

	private Compra generarCompraEjemplo2Tarea(Cliente cliente) {

		Compra compra = new Compra(Mes.ENERO, cliente);
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", new java.math.BigDecimal("12.00"),
				Periodicidad.DIARIA);
		compra.agregarProducto(diarioPagina12);
		DiarioYRevista revistaBarcelona = new DiarioYRevista("Revista Barcelona", new java.math.BigDecimal("20.00"),
				Periodicidad.QUINCENAL);
		Producto suscripcionAnualARevistaBarcelona = new Suscripcion("Suscripcion anual a Revista Barcelona",
				new java.math.BigDecimal("20.00"), revistaBarcelona, TipoSuscripcion.ANUAL);
		compra.agregarProducto(suscripcionAnualARevistaBarcelona);

		return compra;

	}

	private Compra generarCompraEnEnero(Cliente cliente) {

		Compra compra = new Compra(Mes.ENERO, cliente);
		Producto libroElHobbit = new Producto("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00"),
				Periodicidad.MENSUAL);
		compra.agregarProducto(revistaElGrafico);

		return compra;

	}

	private Compra generarCompraEnNoviembre(Cliente cliente) {

		Compra compra = new Compra(Mes.NOVIEMBRE, cliente);
		Producto libroElHobbit = new Producto("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00"),
				Periodicidad.MENSUAL);
		compra.agregarProducto(revistaElGrafico);
		Libro libroElQuijote = new Libro("El Quijote", new java.math.BigDecimal("30.00"));
		Producto unAlquiler = new Alquiler("Alquila el quijote 22 dias", libroElQuijote.alquilerPorDias(22));
		compra.agregarProducto(unAlquiler);

		return compra;

	}

	private Compra generarCompraEnDiciembre(Cliente cliente) {

		Compra compra = new Compra(Mes.DICIEMBRE, cliente);
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", new java.math.BigDecimal("12.00"),
				Periodicidad.DIARIA);
		compra.agregarProducto(diarioPagina12);
		DiarioYRevista revistaBarcelona = new DiarioYRevista("Revista Barcelona", new java.math.BigDecimal("20.00"),
				Periodicidad.QUINCENAL);
		Producto suscripcionAnualARevistaBarcelona = new Suscripcion("Suscripcion anual a Revista Barcelona",
				new java.math.BigDecimal("20.00"), revistaBarcelona, TipoSuscripcion.ANUAL);
		compra.agregarProducto(suscripcionAnualARevistaBarcelona);
		Libro libroElQuijote = new Libro("El Quijote", new java.math.BigDecimal("30.00"));
		Producto unAlquiler = new Alquiler("Alquila el quijote 2 meses", libroElQuijote.alquilerMensual(2));
		compra.agregarProducto(unAlquiler);

		return compra;

	}

	private Compra generarCompraEnMayo(Cliente cliente) {

		Compra compra = new Compra(Mes.MAYO, cliente);
		Producto libroElHobbit = new Producto("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00"));
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00"),
				Periodicidad.MENSUAL);
		compra.agregarProducto(revistaElGrafico);
		Libro libroElQuijote = new Libro("El Quijote", new java.math.BigDecimal("30.00"));
		Producto unAlquiler = new Alquiler("Alquila el quijote 1 cuatrimestre",
				libroElQuijote.alquilercuatrimestral(1));
		compra.agregarProducto(unAlquiler);

		return compra;

	}

}
