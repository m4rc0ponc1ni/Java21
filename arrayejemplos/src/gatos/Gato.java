package gatos;
import java.util.*;

public class Gato implements Comparable <Gato>{
	
	private String nombre;
	private String raza;
	private String color;

	
	public Gato (String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public String toString() {
		return "nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
	}
 /* Para indicar como se va a relaizar la ordenacion de los gatos
  * hay que indicar a Java si va a ser por color, por nombre, por peso...
  * 
  * para ello, la clase debe implementar la Interfaz COMPARABLE y definir el méto compareTo:
  * ---> 0 si los elementos son iguales
  * --->(-) si el primero elemento es menor que el segundo
  * ---> (+) Si el primer elemento es mayor que el segundo
  * 
  * Las clases String, Integer, Double,... ya tienen implementado su propio metodo (esto seria lo
  * Por lo tanto, nosotros solo tenemos que escribir en nuestro codigo un compareTo con los atributos por los que queremos comparar.
  */
	public int compareTo(Gato g) {
		int comparacion;
		
		comparacion = (this.nombre).compareTo(g.getNombre());
		return comparacion;
	}
	public boolean equals (Gato g) {
		return (this.nombre).equals(g.getNombre());
		}
}
