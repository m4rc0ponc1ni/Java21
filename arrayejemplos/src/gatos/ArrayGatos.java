package gatos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayGatos {
	public static void main(String[]args) {
		
	
	ArrayList<Gato> g = new ArrayList<Gato>();

//añado los gatos a la lista usando su metodo constructor

		g.add(new Gato("Garfiel", "naranja", "mestizo"));
		 g.add(new Gato("pepe", "gris", "angora"));
		 g.add(new Gato("mauri", "blanco", "manx"));
		 g.add(new Gato("ulises", "marron", "persa"));
		 g.add(new Gato("medianoche", "gris", "egipcio"));
		 g.add(new Gato("juana", "tricolor", "calicó"));
		 
		 System.out.println("\n Datos de los gatos antes de ordenar:\n");
		 for (Gato gatoAux: g) {
			 System.out.println(gatoAux + "\n");
		 }
		 //se ordenaran seguun el metodo compareto definido en la clase gato
		 
		 Collections.sort(g);
		 
		 System.out.println("\n Datos de los gatos ordenados por nombre");
		 for (Gato gatoAux: g) {
			 System.out.println(gatoAux + "\n");
		 }
}
}