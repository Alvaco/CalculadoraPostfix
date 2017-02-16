import java.util.ArrayList;


public class PilaArrayList <E> implements iPila{

	private ArrayList lista;
	
	/**
	 *Constructor 
	 */
	public PilaArrayList(){
		lista = new ArrayList<E>();
	}
	
	/** 
	 * @param algo
	 * Agrega un elemento a la lista
	 */
	@Override
	public void push(Object algo) {
		lista.add(algo);
		// TODO Auto-generated method stub
		
	}

	@Override
	/** 
	 * Remueve y devuelve el �ltimo elemento de la lista
	 */
	public Object pop() {
		// TODO Auto-generated method stub
		return lista.remove(0);
	}

	@Override
	/**	
	 * Revisa si la lista se encuentra vac�a
	 * Devuelve true si est� vac�a
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return lista.size() == 0;
	}
	
}
