import java.util.Vector;

/**
  Michelle Morales 15322
	Joseline Ortiz 15039
*/

/**
 * @param <E> Cualquier objeto
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{
	protected Vector<E> data; // the data, kept in heap order

	/**
   * Crea una nueva Prioruty queue
	 * post: constructs a new priority queue
	 */
	public VectorHeap()
	{
		data = new Vector<E>();
	}

	/**
   * Crea una nueva Prioruty queue de un vector que no esta ordenado
	 * post: constructs a new priority queue from an unordered vector
	 * @param v, un vector tipo E
	 */
	public VectorHeap(Vector<E> v)
	{
		int i;
    /**recorre el vector*/
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}
	/**
	 * pre: 0 <= i < size
   * indica la posicion del nodo padre
	 * post: returns parent of node at location i
	 * @param i, the location
	 * @return
	 */
	protected static int parent(int i)
	{
		return (i-1)/2;
	}

	/**
	 * pre: 0 <= i < size
   * retorna el hijo izquierdo
	 * post: returns index of left child of node at location i
	 * @param i, the location
	 * @return
	 */
	protected static int left(int i)
	{
		return 2*i+1;
	}

	/**
	 * pre: 0 <= i < size
   * retorna el hijo derecho
	 * post: returns index of right child of node at location i
	 * @param i, the location
	 * @return
	 */
	protected static int right(int i)
	{
		return (2*i+1) + 1;
	}

	/**
	 * pre: 0 <= leaf < size
   * mueve el nodo a la posicion que le corresponde
	 * post: moves node at index leaf up to appropriate position
	 * @param leaf
	 */
	protected void percolateUp(int leaf)
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

	/**
	 * pre: value is non-null comparable
	 * post: value is added to priority queue
	 */
	public void add(E value)
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

	/**
	 * pre: 0 <= root < size
   * cambia el root
	 * post: moves node at index root down to appropriate position in subtree
	 * @param root
	 */
	protected void pushDownRoot(int root)
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

	/**
	 * pre: !isEmpty()
   * retorna el valor minimo
	 * post: returns and removes minimum value from queue
	 */
	public E remove()
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

	public E getFirst() {
		E first = null;
		
		if((data.size()) > 0){
			first = data.get(0);
			return first;
		}
		
		return first;
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

	public int size() {
		return data.size();
	}

	public void clear() {
		
	}
	
}
