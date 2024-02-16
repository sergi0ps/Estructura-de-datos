package es.juana.dbll;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class TestDoubleLinkedList {

	@Test
	void testAdd1() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		assertEquals("[7]", lista.toString());
	}

	@Test

	void testAdd2() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();


		lista.add(7);
		lista.add(2);
		lista.add(3);
		lista.add(88);	

		assertEquals("[7,2,3,88]", lista.toString());
	}

	@Test
	void testAddDos() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(3, 0);
		assertEquals("[3,7,6,5]", lista.toString());
	}
	
	@Test
	void testAddTres() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(3, 3);
		assertEquals("[7,6,5,3]", lista.toString());
	}

	@Test
	void testAddCuatro() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(13);
		lista.add(9);
		lista.add(3,2);
		assertEquals("[7,6,3,5,13,9]", lista.toString());
	}
	
	@Test
	void testGet() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(13);
		lista.add(9);
		
		lista.get(3);
		assertEquals(5, lista.get(3));
	}
	
	@Test
	void testRemovePosicionInicio() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(13);
		lista.add(9);
		Integer num = lista.remove(0);
		assertEquals(7, num);
		assertEquals("[6,5,13,9]", lista.toString());
	}
	
	@Test
	void testRemovePosicionFinal() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5); 
		lista.add(13);
		lista.add(9);
		Integer num = lista.remove(4);
		assertEquals(9, num);
		assertEquals("[7,6,5,13]", lista.toString());
	}
	@Test
	void testRemovePosicioX() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(13);
		lista.add(9);
		Integer num = lista.remove(3);
		assertEquals(13, num);
		assertEquals("[7,6,5,9]", lista.toString());
	}
	
	@Test
	void testRemoveElemntoInicio() {
		DoubleLinkedListSergio<String> lista = new DoubleLinkedListSergio<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.remove("A");
		
		assertEquals("[B,C,D]", lista.toString());
	}
	
	@Test
	void testRemoveElemntoFinal() {
		DoubleLinkedListSergio<String> lista = new DoubleLinkedListSergio<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.remove("D");
		
		assertEquals("[A,B,C]", lista.toString());
	}
	
	@Test
	void testRemoveElemntoX() {
		DoubleLinkedListSergio<String> lista = new DoubleLinkedListSergio<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.remove("C");
		
		assertEquals("[A,B,D]", lista.toString());
	}
	
	@Test
	void testIsEmpty() {
		DoubleLinkedListSergio<String> lista = new DoubleLinkedListSergio<String>();
		
		assertTrue(lista.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		DoubleLinkedListSergio<String> lista = new DoubleLinkedListSergio<String>();
		lista.add("A");
		assertFalse(lista.isEmpty());
	}
	
	

	@Test
	void testSiezeConCosas() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(3);


		assertEquals(4, lista.size());
	}

	@Test
	void testSiezeSinCosas() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();
		
		assertEquals(0, lista.size());
	}
	@Test
	void testClear() {
		DoubleLinkedListSergio<Integer> lista = new DoubleLinkedListSergio<Integer>();

		lista.add(7);
		lista.add(6);
		lista.add(5);
		lista.add(3);
		lista.clear();
		assertEquals("[]", lista.toString());

	}
	

}
