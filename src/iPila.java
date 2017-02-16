
public interface iPila<E>{
	
	/**
	 * @param algo
	 * Ingresa un elemento a un objeto
	 */
	public void push(E algo);
	
	/**
	 * @return un elemento del final de una lsita
	 */
	public E pop();
	
	/**
	 * @return true si el objeto est� vac�o
	 */
	public boolean isEmpty();
	
}


