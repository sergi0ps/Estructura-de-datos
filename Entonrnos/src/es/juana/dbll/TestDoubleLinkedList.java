package es.juana.dbll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.juana.lnkd.LinkedListSergio;

public class TestDoubleLinkedList {
	
	@Test
	void testAdd1() {
		DoubleLinkedListSergio <Integer> lista = new DoubleLinkedListSergio<Integer>();
		
		lista.add(7);
		assertEquals("[7]", lista.toString());
	}
	
	@Test
	void testAdd2() {
		DoubleLinkedListSergio <Integer> lista = new DoubleLinkedListSergio<Integer>();
		lista.add(7);
		lista.add(2);
		lista.add(3);
		lista.add(8);	
		
		assertEquals("[7,2,3,8]", lista.toString());
	}
	
}
