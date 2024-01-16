package entonos;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameter;

class MetodosUtilesTest {

	@Test 
	void testFactorial1() {
		int esperado = 1;
		int calculado = MetodosUtiles.Factorial(1);
		
		
		assertEquals(esperado, calculado);
	}
	@Test
	void testFactorial2() {
		int esperado = 1;
		int calculado = MetodosUtiles.Factorial(0);
		
		
		assertEquals(esperado, calculado);
	}
	@Test
	void testFactorial3() {
		int esperado = 120;
		int calculado = MetodosUtiles.Factorial(5);
		
		
		assertEquals(esperado, calculado);
	}
	@Test
	void testFactorial() {
		int esperado = 3628800;
		int calculado = MetodosUtiles.Factorial(10);
		
		
		assertEquals(esperado, calculado);
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 11,23,17 })
	void testPrimos(int numero) {
		boolean condicion = MetodosUtiles.esPrimo(numero);
		assertTrue(condicion);
	}
}


