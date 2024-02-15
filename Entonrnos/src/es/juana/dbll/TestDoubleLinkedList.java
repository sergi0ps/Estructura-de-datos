package es.juana.dbll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.juana.lnkd.LinkedListSergio;

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

}
