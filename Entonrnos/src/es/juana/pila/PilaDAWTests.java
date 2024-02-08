package es.juana.pila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PilaDAWTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testPush() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		String stringPila = pila.toString();
		assertEquals("[1,2,3]", stringPila);

	}
	
	@Test
	void testPop() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		Object elemento = pila.pop();
		String stringPila = pila.toString();
		assertEquals("[1,2]", stringPila);
		assertEquals(3,elemento);
	}
	
	@Test
	void testTop() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(14);
		pila.push(33);
		pila.push(2);
		Object elemento = pila.top();
		
		assertEquals(2, elemento);
	}
	
	@Test
	void testIsEmpty() {
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		assertTrue(pila.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		assertFalse(pila.isEmpty());
	}
	
	@Test
	void testTamano() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		pila.push(14);
		pila.push(2);
		
		assertEquals(3, pila.size());
	}
	
	@Test
	void testClear() {
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		pila.push(14);
		pila.push(2);
		
		pila.clear();
		assertEquals(0, pila.size());
		assertTrue(pila.isEmpty());
		assertEquals("[]",pila.toString());
	}
	
	@Test
	void estaElemento() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		pila.push(14);
		pila.push(2);
		
		boolean esta = pila.contains(14);
		assertTrue(esta);
	}
	
	@Test
	void noEstaElemento() {
		
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		pila.push(14);
		pila.push(2);
		
		boolean esta = pila.contains(55);
		assertFalse(esta);
	}
	
	@Test
	void toArray() {
		PilaDAW<Integer> pila = new PilaDAW<Integer>();
		pila.push(33);
		pila.push(14);
		pila.push(2);
		
		Object[] arrayPila = pila.toArray();
		assertEquals(3, arrayPila.length);
		assertEquals(33, arrayPila[0]);
		assertEquals(14, arrayPila[1]);
		assertEquals(2, arrayPila[2]);
	}
	
	
}
