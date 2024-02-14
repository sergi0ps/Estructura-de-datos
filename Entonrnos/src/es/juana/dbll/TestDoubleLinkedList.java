package es.juana.dbll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.juana.lnkd.LinkedListSergio;

public class TestDoubleLinkedList {
	
	@Test
	public void testAdd1() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		
		lista.add(7);
		
		assertEquals("[7]", lista.toString());
	}
	
	@Test
	public void testAdd2() {
		LinkedListSergio <Integer> lista = new LinkedListSergio<Integer>();
		
		lista.add(7);
		lista.add(6);
		lista.add(5);
		
		assertEquals("[7,6,5]", lista.toString());
	}
}
