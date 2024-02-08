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
		StringBuffer str = new StringBuffer();
		str.append("[");
		
		Nodo<T> actual = inicial;
		
		while(actual.siguiente != null ) {
			
			str.append(actual)
			
		}
		
	}

}
