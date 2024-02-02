package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MetodosUtilesTest {

	@Test
	void testFactorialDeCero() {
		int factCero = MetodosUtiles.factorial(0);
		assertEquals(1, factCero);
		//compruebo que factCero es 1
	}

	@Test
	void testFactorialDeUno() {
		int factUno = MetodosUtiles.factorial(1);
		assertEquals(1, factUno);
		//compruebo que factUno es 1
	}

	@Test
	void testFactorialDeCinco() {
		int factCinco = MetodosUtiles.factorial(5);
		assertEquals(120, factCinco);
		//compruebo que el factorial de 5 es 120
	}

	@Test
	void testFactorialDeDiez() {
		int factDiez = MetodosUtiles.factorial(10);
		assertEquals(3628800, factDiez);
		//compruebo que el factorial de 10 es 3628800
	}


	//----------------------------------------------------------------------------//

	@Test
	void testOnceEsPrimo() {
		boolean comprobacion = MetodosUtiles.esPrimo(11);
		//Como esperamos que comprobacion sea true, voy a usar assertTrue
		assertTrue(comprobacion);		
	}

	@Test
	void testDiezNoEsPrimo() {
		boolean comprobacion = MetodosUtiles.esPrimo(10);
		//Como esperamos que comprobacion sea false, voy a usar assertFalse
		assertFalse(comprobacion);		
	}

	@Test
	void testCeroPrimo() {
		boolean comprobacion = MetodosUtiles.esPrimo(0);
		assertFalse(comprobacion);		
	}

	//TEST PARAMETRIZADO de todo numeros primos
	@ParameterizedTest
	@ValueSource(ints = {17, 7, 13, 23, 11} )
	void testTodoPrimos(int numeroAComprobar) {
		boolean comprobacion = MetodosUtiles.esPrimo(numeroAComprobar);
		assertTrue(comprobacion);
	}

	//TEST PARAMETRIZADO de todo numeros compuestos
	@ParameterizedTest
	@ValueSource(ints = {4,6,8,20,33,333,1000} )
	void testTodoNoPrimos(int numeroAComprobar) {
		boolean comprobacion = MetodosUtiles.esPrimo(numeroAComprobar);
		assertFalse(comprobacion);
	}

	//--------------------------------------------//


	@Test
	void mcdNormal() {
		int mcd = MetodosUtiles.mcd(75, 15);
		assertEquals(15, mcd);
	}
	
	@Test
	void mcdNormal2() {
		int mcd = MetodosUtiles.mcd(120, 80);
		assertEquals(40, mcd);
	}
	
	@Test
	void mcdConCero() {
		int mcd = MetodosUtiles.mcd(100, 0);
		assertEquals(100, mcd);
	}
	
	@Test
	void mcdConCero2() {
		int mcd = MetodosUtiles.mcd(100, 1);
		assertEquals(1, mcd);
	}
	
	@Test
	void mcdConCero3() {
		int mcd = MetodosUtiles.mcd(0, 1);
		assertEquals(1, mcd);
	}
	
	//----------------------------------------------------//
	
	@Test
	void potenciaNormal() {
		int resultado = MetodosUtiles.potencia(2, 4);
		assertEquals(16, resultado);
	}
	
	@Test
	void potenciaBaseCero() {
		int resultado = MetodosUtiles.potencia(0, 4);
		assertEquals(0, resultado);
	}
	
	@Test
	void potenciaBaseUno() {
		int resultado = MetodosUtiles.potencia(1, 4);
		assertEquals(1, resultado);
	}
	
	@Test
	void potenciaExponenteNegativo() {
		int resultado = MetodosUtiles.potencia(2, -4);
		assertEquals(0, resultado);
	}
	
	@Test
	void potenciaBaseNegativaExponentePar() {
		int resultado = MetodosUtiles.potencia(-2, 4);
		assertEquals(16, resultado);
	}
	
	@Test
	void potenciaBaseNegativaExponenteImpar() {
		int resultado = MetodosUtiles.potencia(-2, 3);
		assertEquals(-8, resultado);
	}
	
	@Test
	void potenciaExponenteCero() {
		int resultado = MetodosUtiles.potencia(2, 0);
		assertEquals(1, resultado);
	}
	
	@Test
	void ceroElevadoACero() {
		int resultado = MetodosUtiles.potencia(0, 0);
		assertEquals(1, resultado);
	}
	
	//--------------------------------------------------//
	
	@Test
	void invertirCadenaNormal() {
		String inversa = MetodosUtiles.invertir("HOLA");
		assertEquals("ALOH",inversa);
	}
	
	@Test
	void invertirCadenaNumerica() {
		String inversa = MetodosUtiles.invertir("HOLA12!");
		assertEquals("!21ALOH", inversa);
	}
	
	@Test
	void invertirCadenaEspacios() {
		String inversa = MetodosUtiles.invertir("h\na");
		assertEquals("a\nh", inversa);
	}
	
	@Test
	void invertirCadenaVacia() {
		String inversa = MetodosUtiles.invertir("");
		assertEquals("",inversa);
	}
	
	@Test
	void invertirCadenaNula() {
		String inversa = MetodosUtiles.invertir(null);
		assertEquals(null,inversa);
	}
	
	//------------------------------------------//
	
	@RepeatedTest(10)
	void testNumerosAleatorios() {
		
		int minimo = 7;
		int maximo = 32;
		
		int aleatorio = MetodosUtiles.numeroAleatorioEntre(minimo,maximo);
		boolean cumpleCondiciones = (aleatorio >= minimo) 
								 && (aleatorio <= maximo)
								 && (aleatorio%2 !=0 ) ;
		
		assertEquals(true, cumpleCondiciones);
		
	}
	
	
	
	
	
	


}
