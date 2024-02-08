package es.juana.lnkd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testadd() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		lista.add(7);
		
		assertEquals(7,7);
	}


}
