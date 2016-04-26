package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class Libro extends Producto {

	public Libro(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}

	public BigDecimal alquilerPorDias(int dias) {
		if (dias < 3 || dias > 25) {
			throw new Error("cantidad de dias invalido");
		}

		BigDecimal monto = new BigDecimal("10.00");
		BigDecimal diasCantidad = new BigDecimal(dias);
		BigDecimal aPagar = monto.multiply(diasCantidad);

		return aPagar;
	}

	public BigDecimal alquilerMensual(int meses) {
		if (meses < 1 || meses > 3) {
			throw new Error("cantidad de meses invalido");
		}

		BigDecimal monto = new BigDecimal("200.00");
		BigDecimal mesesCantidad = new BigDecimal(meses);
		BigDecimal aPagar = monto.multiply(mesesCantidad);

		return aPagar.divide(mesesCantidad);
	}

	public BigDecimal alquilercuatrimestral(int cuatrimestres) {
		if (cuatrimestres < 1 || cuatrimestres > 2) {
			throw new Error("cantidad de cuatrimestres invalido");
		}

		BigDecimal cien = new BigDecimal("100.00");
		BigDecimal descuento = new BigDecimal("10.00");
		BigDecimal monto = new BigDecimal("200.00");
		BigDecimal cuatrimestresCantidad = new BigDecimal(cuatrimestres);

		BigDecimal meses = new BigDecimal("4.00");
		BigDecimal mesesAlquilados = meses.multiply(cuatrimestresCantidad);
		BigDecimal montoAPagar = monto.multiply(mesesAlquilados);
		BigDecimal descuentoAux = montoAPagar.multiply(descuento).divide(cien);
		BigDecimal totalAPagar = montoAPagar.subtract(descuentoAux);

		return totalAPagar.divide(mesesAlquilados);
	}
}
