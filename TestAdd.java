
/** 
    Joseline Ortiz 15039
    Michelle Morales 15322
	
	TestAdd Prueba la inserci�n de una cadena en la implementaci�n de VectorHeap
**/
import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

/**
 */

public class TestAdd {

	/**
	 * Prueba la inserci�n de una cadena en la implementacion VectorHeap.
	 */
	@Test
	public void testAdd() {
		Vector<String> vQueue = new Vector<String>();
		vQueue.add("B");
		VectorHeap<String> pQueue = new VectorHeap<String>(vQueue);
		
		// Test
		// Prueba la inserci�n en el VectorHeap
		
		pQueue.add("A");
		
		String result = pQueue.getFirst();
		assertEquals("A", result); // Si la insercion fue correcta, deberia regresar el valor con mayor prioridad, que es A.
	}
	
	/**
	 * Prueba la inserci�n de un entero en la implementacion VectorHeap.
	 */
	@Test
	public void testAddInt() {
		Vector<Integer> vQueue = new Vector<Integer>();
		vQueue.add(3);
		VectorHeap<Integer> pQueue = new VectorHeap<Integer>(vQueue);
		
		// Test
		// Prueba la inserci�n en el VectorHeap
		
		pQueue.add(2);
		
		int result = pQueue.getFirst();
		assertEquals(2, result); // Si la insercion fue correcta, deberia regresar el valor con mayor prioridad, que es 2.
	}
	
	/**
	 * Prueba la inserci�n de un objeto tipo Paciente en la implementacion VectorHeap.
	 */
	@Test
	public void testAddPaciente() {
		Vector<Paciente> vQueue = new Vector<Paciente>();
		Paciente pPrueba = new Paciente("Sandra", "C�lculos renales", "B");
		vQueue.add(pPrueba);
		VectorHeap<Paciente> pQueue = new VectorHeap<Paciente>(vQueue);
		
		// Test
		// Prueba la inserci�n en el VectorHeap
		Paciente pPrueba2 = new Paciente("Melissa", "15 pu�alas", "A");
		pQueue.add(pPrueba2);
		
		Paciente result = pQueue.getFirst();
		assertEquals(pPrueba2, result); // Si la insercion fue correcta, deberia regresar el valor con mayor prioridad, que es pPrueba2.
	}

}
