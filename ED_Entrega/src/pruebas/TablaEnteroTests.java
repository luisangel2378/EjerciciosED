package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Entrega.TablaEnteros;



class TablaEnteroTests {
	
	static TablaEnteros tabla;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception{
	
		Integer initabla [] = { 1, 2, 3, 4, 5, 6, 7};
		
		tabla = new TablaEnteros(initabla);
		
	
	}
	
	@Test
	void testSumaTabla() {
		
		int num = tabla.sumaTabla();
		
		assertEquals(28 , num);
	}

	@Test
	void testMayorTabla() {
		
		int num = tabla.mayorTabla();
		
		assertEquals(7, num);
	}

	@Test
	void testPosicionTabla() {

		int pos = tabla.posicionTabla(7);
		
		assertEquals(6, pos);
	}

}
