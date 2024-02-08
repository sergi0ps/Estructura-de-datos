package listaEnlazada;

public class LinkedListSergio <T> implements LinkedList<T> {
	private Nodo <T> inicial;
	@Override
	public void add(T elemento) {
        Nodo<T> nodoNuevo = new Nodo<T>(elemento);
        if (inicial == null) {
            inicial = nodoNuevo;
        } else {
            Nodo<T> aux = inicial;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nodoNuevo;
        }
    }
		


	@Override
	public void add(T elemento, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
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
		return null;
		
	}

}
