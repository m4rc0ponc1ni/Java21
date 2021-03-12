package arrayejemplos;
import java.util.*;

public class ArrayColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> a = new ArrayList<String>();
			
			//obtener numero de elementos del arraylist con size()
			System.out.println("Nª de elementos: " + a.size());
			
			//Añadir elementos en ArrayList
			a.add("rojo");
			a.add("verde");
			a.add("azul");
			
			System.out.println("Nº de elementos: " + a.size());
			
			a.add("blanco");
			
			//Obtener elementos sueltos del ArrayList mediante su posición
			System.out.println("El elemento que hayt ebn la posicion 0 es " + a.get(0));
			System.out.println("El elemento que hayt ebn la posicion 3 es " + a.get(3));
			
			a.add("amarillo");
			
			//Recorrer el Arraylist mostrando sus elementos con bucle for
			System.out.println("Comntendio del array con for: ");
			for (int i=0; i <a.size(); i++) {
				System.out.println(a.get(i));
			}
			a.add("naranja");
			
			//Recorrer el ArrayList mostrando sus elementos como bucle FOR EACH
			System.out.println("Contenido del array con FOREACH ");
			for (String elemento:a) {
				System.out.println(elemento);
	}
/* Eliminar elementos deñ Array con el metodo remove(), pasandole como parámetro
 * el indice del elemento que queremos eliminar o el valor del elemento.
 * nota: El array se reestructura de forma automatica despues del borrado.*/
 if (a.contains("blanco")) {
	 System.out.println("El blanco está en el array de colores");
	 a.remove("blanco"); //borro por valor
 }
 System.out.println("Contendio de la lista despues de quitar la primera ocurrencia del color blanco: ");
 for(String color: a) {
	 System.out.println(color);
 }
	 a.remove(2); //Borro por posicion
	 System.out.println("Contenido de la lista despues de quitar el elemento de la posicion 2: ");
	 for (String color: a) {
		 System.out.println(color);
	 }
	 /* Cambiar el contenido de un elemento del array con otro--> Metodo set
	  * Borramos lo que hubiera en la posicion 2 y metemos "morado";
	  * en un array estatico esto se haria ----> a[2] = "morado"
	  */
	 a.set(2, "morado");
	 System.out.println("contenido del array despues de machacar la posicion 2: ");
	for (String color: a) {
		 System.out.println(color); 
		 
	 }
	/* Añadir elementos al Arraylist en una posicion determinada
	 * Al igual que en el borrado, el ArrayList se reestructura de manera automatica
	 */
	a.add(1, "turquesa");
	System.out.println("Contenido del array despues de insertar en la posicion 1: ");
	for (String color: a) {
		System.out.println(color);
	}
 }
}
