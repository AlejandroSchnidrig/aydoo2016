package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

public class MaquinaDeCafeTest {
	
	@Test
	public void PonerAzucarAlVaso(){
		
		Vaso unVaso = new Vaso();
		Azucarero unAzucarero = new Azucarero();
		
		unAzucarero.ponerNCucharadasDeAzucar(unVaso, 3);
		
		Assert.assertEquals(3, unVaso.getCucharadasAzucar());
	}
	
	@Test
	public void PonerLecheAlVaso(){
		
		Vaso unVaso = new Vaso();
		Lechero unLechero = new Lechero();
		
		unLechero.ponerNCantidadDeLeche(unVaso, 100);
		
		Assert.assertEquals(100, unVaso.getCantidadLeche());
		Assert.assertEquals(250, unVaso.getCapacidad());
	}
	
	@Test(expected = Error.class)
	public void PonerLecheAlVasoSoprepasaCapacidad(){
		
		Vaso unVaso = new Vaso();
		Lechero unLechero = new Lechero();
		
		unLechero.ponerNCantidadDeLeche(unVaso, 400);
	}
	
	@Test
	public void PonerCafeAlVaso(){
		
		Vaso unVaso = new Vaso();
		Cafetero unCafetero = new Cafetero();
		
		unCafetero.ponerNCantidadDeCafe(unVaso, 250);
		
		Assert.assertEquals(250, unVaso.getCantidadBebida());
		Assert.assertEquals(100, unVaso.getCapacidad());
	}
	
	@Test(expected = Error.class)
	public void PonerLecheYCafeAlVasoSoprepasaCapacidad(){
		
		Vaso unVaso = new Vaso();
		Lechero unLechero = new Lechero();
		Cafetero unCafetero = new Cafetero();
		
		unLechero.ponerNCantidadDeLeche(unVaso, 50);
		unCafetero.ponerNCantidadDeCafe(unVaso, 325);
	}
	
	@Test
	public void PrepararCafeConLecheConDosCucharadasDeAzucar(){
		
		Vaso unVaso = new Vaso();
		Lechero unLechero = new Lechero();
		Cafetero unCafetero = new Cafetero();
		Azucarero unAzucarero = new Azucarero();
		
		unCafetero.ponerNCantidadDeCafe(unVaso, 250);
		unLechero.ponerNCantidadDeLeche(unVaso, 100);
		unAzucarero.ponerNCucharadasDeAzucar(unVaso, 2);
		
		Assert.assertEquals(0, unVaso.getCapacidad());
		Assert.assertEquals(250, unVaso.getCantidadBebida());
		Assert.assertEquals(100, unVaso.getCantidadLeche());
		Assert.assertEquals(2, unVaso.getCucharadasAzucar());
	}
	
	@Test
	public void HacedorDeCafeConLechePreparaBebida(){
		
		Vaso unVaso = new Vaso();
		HacedorDeCafeConLeche unHacedor = new HacedorDeCafeConLeche();
		
		unHacedor.prepararCafeconLeche(unVaso, 250, 50);
		
		Assert.assertEquals(50, unVaso.getCapacidad());
		Assert.assertEquals(250, unVaso.getCantidadBebida());
		Assert.assertEquals(50, unVaso.getCantidadLeche());
		
	}
	
	@Test
	public void MaquinaExpendedoraPreparaCafeConLeche(){
		
		Vaso unVaso = new Vaso();
		MaquinaExpendedoraDeBebidas miMaquina = new MaquinaExpendedoraDeBebidas();
		
		miMaquina.prepararCafeConLecheConNAzucar(unVaso, 250, 100, 2);
		
		Assert.assertEquals(0, unVaso.getCapacidad());
		Assert.assertEquals(250, unVaso.getCantidadBebida());
		Assert.assertEquals(100, unVaso.getCantidadLeche());
		Assert.assertEquals(2, unVaso.getCucharadasAzucar());
	}
	
	@Test(expected = Error.class)
	public void MaquinaExpendedoraPreparaCafeConLecheSoprepasaCapacidad(){
		
		Vaso unVaso = new Vaso();
		MaquinaExpendedoraDeBebidas miMaquina = new MaquinaExpendedoraDeBebidas();
		
		miMaquina.prepararCafeConLecheConNAzucar(unVaso, 300, 100, 2);
		
		Assert.assertEquals(0, unVaso.getCapacidad());
		Assert.assertEquals(250, unVaso.getCantidadBebida());
		Assert.assertEquals(100, unVaso.getCantidadLeche());
		Assert.assertEquals(2, unVaso.getCucharadasAzucar());
	}
	
	@Test
	public void MaquinaExpendedoraPreparaTeConLeche(){
		
		Vaso unVaso = new Vaso();
		MaquinaExpendedoraDeBebidas miMaquina = new MaquinaExpendedoraDeBebidas();
		
		miMaquina.prepararTeConLecheConNAzucar(unVaso, 225, 125, 1);
		Assert.assertEquals(0, unVaso.getCapacidad());
		Assert.assertEquals(225, unVaso.getCantidadBebida());
		Assert.assertEquals(125, unVaso.getCantidadLeche());
		Assert.assertEquals(1, unVaso.getCucharadasAzucar());
	}
}
