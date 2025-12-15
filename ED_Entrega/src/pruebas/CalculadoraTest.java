package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Entrega.Calculadora;

class CalculadoraTest {
	
	Calculadora test = new Calculadora(2,2);
	
	@Test
	void testResta() {
		
		int resultado = test.resta();
		
		assertEquals(0, resultado);	
		
		
	}

	@Test
	void testResta2() {
		
		boolean testing =  test.resta2();
		
		assertTrue(testing);
	}

	@Test
	void testDivide2() {
		
		Integer resultado = test.divide2();
		
		assertEquals(1, resultado);
		
		if(resultado == null) {
			
			assertNull(resultado);
		}
		
		
	}

}
