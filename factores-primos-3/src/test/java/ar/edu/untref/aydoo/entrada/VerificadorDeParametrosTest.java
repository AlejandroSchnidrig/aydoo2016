package ar.edu.untref.aydoo.entrada;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.entrada.NoParametrosException;
import ar.edu.untref.aydoo.entrada.VerificadorDeParametros;

public class VerificadorDeParametrosTest {
	
	@Test
	public void GuardaElNumeroCorrectamente() throws NoParametrosException, NoNumeroException{
		VerificadorDeParametros verificador = new VerificadorDeParametros();
		String[] args = {"100", "--format=quiet", "--sort:des"};		
		
		verificador.verificarParametros(args);
		
		Assert.assertEquals(100, verificador.getNumero());
	}
	
	@Test
	public void GuardaElFormatoCorrectamente() throws NoParametrosException, NoNumeroException{
		VerificadorDeParametros verificador = new VerificadorDeParametros();
		String[] args = {"100", "--format=quiet", "--sort:des"};		
		
		verificador.verificarParametros(args);
		
		Assert.assertEquals("--format=quiet", verificador.getFormato());
	}
	
	@Test
	public void GuardaElOrdenCorrectamente() throws NoParametrosException, NoNumeroException{
		VerificadorDeParametros verificador = new VerificadorDeParametros();
		String[] args = {"100", "--format=quiet", "--sort:des"};		
		
		verificador.verificarParametros(args);
		
		Assert.assertEquals("--sort:des", verificador.getOrden());
	}
	
	@Test
	public void GuardaLaRutaCorrectamente() throws NoParametrosException, NoNumeroException{
		VerificadorDeParametros verificador = new VerificadorDeParametros();
		String[] args = {"100", "--format=quiet", "----output-file=home/user/hola.txt"};		
		
		verificador.verificarParametros(args);
		
		Assert.assertEquals("home/user/hola.txt", verificador.getRuta());
	}
	
	@Test(expected = NoParametrosException.class)
	public void SeEsperaNoParametosExceptions() throws NoParametrosException, NoNumeroException{
		VerificadorDeParametros verificador = new VerificadorDeParametros();
		String[] args = {};		
		
		verificador.verificarParametros(args);
	}

}
