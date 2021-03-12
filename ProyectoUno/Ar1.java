package ejercicios.ocho;

import javax.swing.JOptionPane;

public class Ar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] ciudad = new String [5]; // Declaramos array para almacenar las 5 ciudades
		
		for (int i = 0; i<5; i++) {// se recorre el bucle para acceder a los valores del array
			
			ciudad [i] = JOptionPane.showInputDialog(null, "Introduce el nombre de una ciudad"); // se introducen las ciudades
		System.out.println("has elegido: " + ciudad[i]  ); // Mostrar el valor del array en cada iteracion
		
String [] semana = new String [7]; // Array que almacena el día de la semana para cada ciudad ya que está dentro del anterior bucle
		
		for (int b = 0; b<7; b++) {//Accedemos a los valores del array 
			
			semana [b] = JOptionPane.showInputDialog(null, "Introduce el día de la semana"); // Se introducen los dias de la semana
		System.out.println("has elegido: " + semana[b]  ); // mostramos por consola el día de la semana elegido para la ciudad elegida
		
double [] temperatura = new double [3]; // declaramos array que almacenará las 3 temperaturas para cada día de la semana en cada ciudad
		
		for (int a = 0;a<3; a++) { // bucle for para acceder al contenido del array 
			temperatura[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce las temperaturas")); // Se introducen los 3 valores 
			System.out.println("temperatura: " + temperatura[a]); // Se muestran las 3 temperaturas para cada día de la semana en cada ciudad.
		}
	}

}
	}}
