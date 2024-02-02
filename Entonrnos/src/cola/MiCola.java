package cola;

public class MiCola<T> implements Cola<T> {
	Object[] cola;
	
	public MiCola() {
		cola = new Object[1];
	}

	@Override
	public void enqueue(T elemento) {
		for (int i = 0; i < cola.length; i++) {
			if(cola[i] == null) {
				cola[i] = elemento;
			}
			
			
		}
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T head() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void bubbleSort() {
		// TODO Auto-generated method stub
		
	}

}
