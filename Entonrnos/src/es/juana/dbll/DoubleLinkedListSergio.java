package es.juana.dbll;



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
		if (index == 0 ) {
			Nodo<T> n = head;
			head = new Nodo<T>(elemento);
			head.siguiente = n;
		}else{
			
		}
		
		
	}
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
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
