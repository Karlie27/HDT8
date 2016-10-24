/**
 * @param <E> Cualquier objeto
 */
public interface PriorityQueue<E extends Comparable<E>>
{
	/**
	 * @return returns the minimum value in priority queue
	 */
	public E getFirst();

	/**
	 * @param value, value is added to priority queue
	 */
	public void add(E value);
	
	/**
	 * @return returns number of elements within queue
	 */
	public int size();
	
        /**
	 * @return returns true if no elements are in queue
	 */
	public boolean isEmpty();
        
	/**
	 * post: removes all elements from queue
	 */
	public void clear();
        
        /**
	 * @return returns and removes minimum value from queue
	 */
	public E remove();
}
