package ar.edu.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unrn.modelo.Calculador;
import ar.edu.unrn.modelo.RemerasImportadas;
import ar.edu.unrn.modelo.RemerasNoImportadas;

public class CalculadorTest {

	@Test
	public void calcularPrendaImportada() {
		Calculador remera= new RemerasImportadas();
		double resultado=remera.calcularPrecio(100);
		
		assertEquals(resultado , 133.0d);
		
	}
	
	@Test
	public void calcularPrendaNoImportada() {
		Calculador remera= new RemerasNoImportadas();
		double resultado=remera.calcularPrecio(100);
		
		assertEquals(resultado , 136.5d);
	}
}
