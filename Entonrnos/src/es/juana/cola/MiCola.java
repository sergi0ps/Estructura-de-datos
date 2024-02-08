package es.juana.cola;

public class MiCola<T> implements Cola<T> {
	Object[] cola;
	
	public MiCola() {
		cola = new Object[0];
	}

	@Override
	public void enqueue(T elemento) {
		Object[] newCola = new Object[cola.length+1];
		for (int i = 0; i < cola.length; i++) {
			newCola[i]= cola[i];
			
		}
		newCola[cola.length] = elemento;
		
		cola=newCola;
	}

	@Override
	public T dequeue() {
		if(cola.length == 0) {
			return null;
		}
		
		T numeroEliminado = (T) cola[0];
		
		Object[] nuevaCola = new Object[cola.length-1];
		
		for (int i = 1; i < cola.length; i++) {
			nuevaCola[i] = cola[i];
			
		}
		cola=nuevaCola;

		return numeroEliminado;
	}

	@Override
	public T head() {
		 
		return (T) cola[0];
	}

	@Override
	public boolean isEmpty() {
		if(cola.length == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		
		return cola.length;
	}

	@Override
	public void clear() {
		cola = new Object[0];
		
	}

	@Override
	public boolean contains(T elemento) {
		boolean contiene = false;
		
		for (int i = 0; i < cola.length; i++) {
			if(cola[i].equals(elemento)) {
				contiene = true;
			}
		}
		
		return contiene;
	}

	@Override
	public Object[] toArray() {
		Object [] array = new Object[cola.length];
		for (int i = 0; i < array.length; i++) {
			array[i]=cola[i];
		}
		
		return array;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[");		
		for (int i = 0; i < cola.length; i++) {
			str.append(cola[i]);
			if(i != cola.length-1) {
				str.append(",");
			}
		}
		str.append("]");
		
		return str.toString();
	}

}
