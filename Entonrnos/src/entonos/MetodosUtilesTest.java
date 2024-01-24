package entonos;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
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
	
	
	
	@ParameterizedTest
		@ValueSource(ints = {16, 4, 6, 8, 10} )
		void testNoPrimos(int numeroAComprobar) {
			boolean comprobacion = MetodosUtiles.esPrimo(numeroAComprobar);
			assertFalse(comprobacion);
		}
	
	@RepeatedTest(10)
	void testNumeroAleatorios() {
		//establecemos un inicio, un final, calculamos  
		int maximo = 32;
		int minimo = 7;
		
		int aleatorio = MetodosUtiles.numeroAleatoriEntre(maximo, minimo);
		boolean cumpleCondiciones = aleatorio >= minimo && aleatorio <= maximo && aleatorio%2 !=0;
		assertEquals(true, cumpleCondiciones);
	}
	
}


