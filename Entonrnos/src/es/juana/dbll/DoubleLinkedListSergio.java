package es.juana.dbll;

import javax.swing.text.Position;

public class DoubleLinkedListSergio<T> implements DoubleLinkedList<T> {
	
	private Nodo <T> head;
	private Nodo <T> tail;

	@Override
	public void add(T elemento) {
		Nodo<T> nuevo = new Nodo<T>(elemento);
		
		if(head == null && tail == null) {
			head = nuevo;
			tail = nuevo;
		}else {
			tail.siguiente = nuevo;
			nuevo.anterior = tail;
			tail = nuevo;
		}
	}

	@Override
	public void add(T elemento, int index) {
		Nodo<T> nuevo = new Nodo<T>(elemento);
		if(index == 0) {
			head.anterior = nuevo;
			nuevo.siguiente = head;
			head = nuevo;
		}else if(index == size()) {
			add(elemento);
		}else {
			int contador = 1;
			Nodo<T> posicion = head;
			while(contador != index) {
				posicion = posicion.siguiente;
				contador++;
			}
			posicion.siguiente.anterior = nuevo;
			nuevo.siguiente = posicion.siguiente;
			nuevo.anterior= posicion;
			posicion.siguiente = nuevo;
			
		}
		
	}
	
	@Override
	public T get(int index) {
		Nodo<T> posicion = head;
		int contador = 1;
		
		while(contador != index) {
			posicion = posicion.siguiente;
			contador++;
		}
		return posicion.getValor();
	
	}
	

	@Override
	public T remove(int index) {
		T objeto;
		if(index == 0) {
			objeto = head.getValor();
			head = head.siguiente;
			
		}else if(index == size()-1) {
			objeto = tail.getValor();
			tail.anterior.siguiente = null;
			tail = tail.anterior;
			
		}else {
			int contador = 1;
			Nodo<T> posicion = head;
			while(contador <= index) {
				posicion = posicion.siguiente;
				contador++;
			}
			objeto = posicion.getValor();
			posicion.anterior.siguiente = posicion.siguiente;
			posicion.siguiente.anterior = posicion.anterior;
			
		}
		
		
		return objeto;
	}

	@Override
	public void remove(T elemento) {
		if(head.getValor() == elemento) {
			head = head.siguiente;
		}else if(tail.getValor() == elemento) {
			tail.anterior.siguiente = null;
			tail = tail.anterior;
		}else {
			Nodo <T> posicion = head;
			while(posicion.getValor() != elemento) {
				posicion = posicion.siguiente;
			}
			posicion.anterior.siguiente = posicion.siguiente;
			posicion.siguiente.anterior = posicion.anterior;
			
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		if(head == null) {
			return 0;
		}else {
			int contador=1;
            Nodo<T> aux = head;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
                contador ++;
            }
            return contador;
        }
	}
	

	@Override
	public void clear() {
		head = null ;
		
	}

	@Override
	public boolean contains(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		
		StringBuffer str = new StringBuffer();
		str.append("[");
		
		Nodo<T> actual = head;
		
		while(actual != null ) {
			
			str.append(actual.getValor());
			if(actual.siguiente != null) {
				str.append(",");
			}
			
			actual = actual.siguiente;
			
		}
		str.append("]");
		return str.toString(); 		
	}


}
