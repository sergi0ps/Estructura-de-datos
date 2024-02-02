package estructuraDatos;

public class PilaDAW<T> implements Pila<T> {

	Object[] pila;
	
	public PilaDAW() {
		pila = new Object[1];
	}

	@Override
	public void push(T elemento) {
		
		for (int i = 0; i < pila.length; i++) {
			if(pila[i]==null) {
				pila[i] = elemento;
			}
		}
		
		Object[] arrayNuevo = new Object[pila.length+1];
		for (int i = 0; i < pila.length; i++) {
			arrayNuevo[i] = pila[i];
		}
		
		pila = arrayNuevo;
		
	}

	@Override
	public T pop() {
		T elemento = (T) pila[pila.length-2];
		Object[] arrayNuevo = new Object[pila.length-1];
		for (int i = 0; i < pila.length-2; i++) {
			arrayNuevo[i] = pila[i];
		}
		pila = arrayNuevo;
		return elemento;
	}

	@Override
	public T top() {
		return (T)pila[pila.length-2];
	}

	@Override
	public boolean isEmpty() {
		if(pila.length == 1 && pila[0]==null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return pila.length-1;
	}

	@Override
	public void clear() {
		pila = new Object[1];
	}

	@Override
	public boolean contains(T elemento) {
		boolean esta = false;
		for (int i = 0; i < pila.length-1; i++) {
			if(pila[i].equals(elemento)) {
				esta = true;
			}
		}
		return esta;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[pila.length-1];
		for (int i = 0; i < array.length; i++) {
			array[i] = pila[i];
		}
		return array;
	}
	
	public String toString() {
		
		StringBuffer str = new StringBuffer();
		str.append("[");		
		for (int i = 0; i < pila.length-1; i++) {
			str.append(pila[i]);
			if(i != pila.length-2) {
				str.append(",");
			}
		}
		str.append("]");
		
		return str.toString();
		
	}
}
