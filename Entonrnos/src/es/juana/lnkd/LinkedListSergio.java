package es.juana.lnkd;

public class LinkedListSergio <T> implements LinkedList<T> {
	
	private Nodo <T> inicial;
	
	@Override
	public void add(T elemento) {

        if (inicial == null) {
            inicial = new Nodo<T>(elemento);
        } else {
            Nodo<T> aux = inicial;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo<T>(elemento);
        }
    }
		


	@Override
	public void add(T elemento, int index) {
		if(index < 0 ) {
			
			System.out.println("No se pude");
			
		} else if(index == 0) {
			
			Nodo<T> n = inicial;
			inicial =  new Nodo<T>(elemento);
			inicial.siguiente = n;
			
		}else if(index == size()) {
			Nodo<T> posicion = inicial;
			Nodo<T> adios = new Nodo<T>(elemento);
			while(posicion.siguiente != null) {
				posicion = posicion.siguiente;
			}
			posicion.siguiente = adios;
			
		}else {
			int contador = 1;
			Nodo<T> posicion = inicial;
			Nodo<T> nuevo = new Nodo<T>(elemento);
			while(contador != index) {
				posicion = posicion.siguiente;
				contador++;
			}
			nuevo.siguiente = posicion.siguiente;
			posicion.siguiente = nuevo;
		}
		
	}

	@Override
	public T remove(int index) {
		
		return null;
		
	}

	@Override
	public void remove(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		if(inicial == null) {
			return 0;
		}else {
			int contador=1;
            Nodo<T> aux = inicial;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
                contador ++;
            }
            return contador;
        }
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
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
		
		Nodo<T> actual = inicial;
		
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
