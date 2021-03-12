package arrayejemplos;
import java.util.ArrayList;
import java.util.Collections;
public class Arrayenteros {
	public static void main(String[]args) {
		
		
		/* Definicion de la estrucutra.
		 * Se utiliza la clase Integer, en lugar del tipo primitivo int.
		 * Estas clases se denominan wrapper y engloban a los tipos
		 * primitivos añadiendoles mas funcionalidades.
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(18);
		a.add(22);
		a.add(-30);
		a.add(67);
		a.add(78);
		a.add(10);
		a.add(4);
		
		System.out.println("\n números en el orden originakl:");
		for (int numero: a) {
			System.out.println(numero);
		}
		Collections.sort(a);
		System.out.println("\n Numeros ordenadors:");
		for (int numero:a ) {
			System.out.println(numero);
		}
	}
	

}
