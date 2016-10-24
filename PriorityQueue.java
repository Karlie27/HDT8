/**
 * Michelle Morales 15322
 * Joseline Ortiz 15039
 */
 
 /**
 * @param <E> Cualquier objeto
 */
public interface PriorityQueue<E extends Comparable<E>>
{
	/**
	 * retorna el valor con la prioridad mas pequeña
	 * @return returns the minimum value in priority queue
	 */
	public E getFirst();

	/**
	 * se agrega un valor nuevo 
	 * @param value, value is added to priority queue
	 */
	public void add(E value);
	
	/**
	 * retorna la cantidad de elementos 
	 * @return returns number of elements within queue
	 */
	public int size();
	
        /**
	 * controla si esta vacia o no 
	 * @return returns true if no elements are in queue
	 */
	public boolean isEmpty();
        
	/**
	 * Borra TODOS los elementos
	 * post: removes all elements from queue
	 */
	public void clear();
        
        /**
	 * devuelve y elimina el valor minimo de la queue
	 * @return returns and removes minimum value from queue
	 */
	public E remove();
}
