package es.juana.lnkd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testadd() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		
		
		
		assertEquals("[7,3]", lista.toString());
	}
	
	@Test
	void testaddInicio() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(5,0);
		
		
		assertEquals("[5,7,3]", lista.toString());
	}
	
	@Test
	void testaddFinal() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(5,2);
		
		
		assertEquals("[7,3,5]", lista.toString());
	}
	
	@Test
	void testaddCualquierPos() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(8);
		lista.add(5,2);
		
		
		assertEquals("[7,3,5,4,9,8]", lista.toString());
	}
	@Test 
	void testRemovePosicionCualquiera1() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(4);
		lista.add(9);
	
		assertEquals("[7,3,4,9]", lista.toString());
		
		lista.remove(0);
		
		assertEquals("[3,4,9]", lista.toString());
	}
	
	@Test 
	void testRemovePosicionCualquiera() {
		LinkedListSergio <String> lista = new LinkedListSergio<String>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
	
		assertEquals("[A,B,C,D]", lista.toString());
		
		lista.remove("A");
		assertEquals("[B,C,D]", lista.toString());
	}
	@Test
	void testIsEmpty() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		
		
		assertTrue(lista.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(34);
		assertFalse(lista.isEmpty());
	}
	
	
	@Test
	void testSize() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(33);
		lista.add(34);
		assertEquals(4, lista.size());
	}
	
	@Test
	void testSize2() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		
		lista.add(34);
		assertEquals(1, lista.size());
	}
	
	@Test
	void testSize3() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();

		assertEquals(0, lista.size());
	}
	
	@Test
	void testClear() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		lista.add(3);
		lista.add(33);
		lista.add(34);
		lista.clear();
		
		assertEquals("[]", lista.toString());
	}
	
	
	


}
