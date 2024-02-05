package cola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import estructuraDatos.PilaDAW;

class MiColaTest {

	@Test
	void testEnqueue() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		
		String stringCola = cola.toString();
		assertEquals("[A,B,C]", stringCola);
	}
	
	@Test
	void testDequeue() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		Object elemento = cola.dequeue();
		String stringPila = cola.toString();
		assertEquals("[B,C]", stringPila);
		assertEquals("A",elemento);
	
	}
	@Test
	void testHead() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		assertEquals("A", cola.head());
	}
	
	@Test
	void testIsEmpty() {
		MiCola<String> cola = new MiCola<String>();
		assertTrue(cola.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		MiCola<String> cola = new MiCola<String>();
		cola.enqueue("A");
		assertFalse(cola.isEmpty());
	}
	
	
	@Test 
	void testSize() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		assertEquals(3, cola.size());
	}
	
	@Test
	void testClear() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		cola.clear();
		assertEquals("[]", cola.toString());
	}
	
	@Test
	void testContais() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		boolean contiene = cola.contains("A");
		assertTrue(contiene);
	}
	
	void testNoContais() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		boolean contiene = cola.contains("Z");
		assertFalse(contiene);
	}
	void testToArray() {
		MiCola<String> cola = new MiCola<String>();
		
		cola.enqueue("A");
		cola.enqueue("B");
		cola.enqueue("C");
		
		Object[] arrayCola = cola.toArray();
		assertEquals(3, arrayCola.length);
		assertEquals("A", arrayCola[0]);
		assertEquals("B", arrayCola[1]);
		assertEquals("C", arrayCola[2]);
	}

}
