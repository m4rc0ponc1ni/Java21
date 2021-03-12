package tema2;

import javax.swing.JOptionPane;

public class ejercicioU1_T2_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] ejercicios = {"Ejercicio 1", "Ejercicio 2","Ejercicio 3","Ejercicio 4","Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8","Salir"};
		
		int eleccion =0;
		
		while (eleccion!=8) {
			
			eleccion = JOptionPane.showOptionDialog(null, "¿Elige el ejercicio qué quieres realizar?", "MENÚ",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
													ejercicios, ejercicios[8] );
			
			switch (eleccion){
			case 0: {
					ejercicio1();
					break;
			}// fin del caso 0
			case 1: {
				ejercicio2();
				break;
			}// fin del caso 1
			
			case 2,3,4,5,6,7: {
				JOptionPane.showMessageDialog(null, "En fase de implementación");				
				break;
			}// IMPLEMENTANDO
			
			case 8 : { //el usuario decide salir
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa" );
				System.exit(0); //CIERRA EL PROGRAMA
			}// Fin del caso 8							
			
			}// fin del switch (eleccion)
		}// fin del while
		
	}// Fin del MAIN
		
	/*Crear una aplicación que calcule el área y la circunferencia de un círculo. 
	 * El usuario deberá elegir cúal de las dos operaciones quiere realizar, 
	 * por lo que habrá que mostrarle las opciones que tiene (Ej: 1- Area del círculo 2- Circunferencia 3- Salir).
	 * Los valores que se necesiten habrá que pedírselos por teclado (ej:  radio).
	 * El programa no debe terminar hasta que el usuario pulse la opción para salir	 */
		public static void ejercicio1 () {
		
		// Aqui he creado un array que tiene las opciones entre las que puede elegir el usuario para hacer
		String[] calculos = {"Area del triángulo", "Area del circulo","Longitud del circulo","Salir"};
		
		/* aqui hago un JOptionPane con showOptionDialog para que el usuario eliga una de las 4 opciones del objeto que hemos creado antes
		 lo asigno a una variable int, para que si elige la primera opcion se almacene la posicion del objeto en la que este esa opcion
		 Ejemplo: si elige Circunferencia se almacenará un 1 porque esta en la posicion nº 1*/
	
		int opcion = 0;
		while (opcion!= 3) {
			opcion = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "MENÚ",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, calculos, calculos[0] );
			switch (opcion) {
			case 0 : { //El usuario elige calcular el area del triángulo
				JOptionPane.showMessageDialog(null, "Vamos a hacer el area de un triangulo que elijas", "TRIANGULO", JOptionPane.INFORMATION_MESSAGE );
				// pido el radio del triangulo con un joptionpane.showInputDialog, que te da un valor de tipo String
				String basestring = JOptionPane.showInputDialog(null, "Cuál es la base de tu triangulo??", "TRIANGULO", JOptionPane.QUESTION_MESSAGE );
				// convierto el String del joptionpane a double
				double base = Double.parseDouble(basestring);
				// pido la altura del triangulo con un joptionpane.showInputDialog, que te da un valor de tipo String
				String alturastring = JOptionPane.showInputDialog(null, "Cuál es la altura de tu triangulo??", "TRIANGULO", JOptionPane.QUESTION_MESSAGE );
				// convierto el String del joptionpane a double
				double altura = Double.parseDouble(alturastring);
				// con este bucle compruebo que tanto la altura como el radio sean mayores a 0
				while (base < 0 || altura < 0) {
					JOptionPane.showMessageDialog(null, "El radio y la altura deben ser mayores de 0", "ERROR", JOptionPane.ERROR_MESSAGE );
					basestring = JOptionPane.showInputDialog(null, "Cuál es la base de tu triangulo??", "TRIANGULO", JOptionPane.QUESTION_MESSAGE );
					// convierto el String del joptionpane a double
					base = Double.parseDouble(basestring);
					// pido la altura del triangulo con un joptionpane.showInputDialog, que te da un valor de tipo String
					alturastring = JOptionPane.showInputDialog(null, "Cuál es la altura de tu triangulo??", "TRIANGULO", JOptionPane.QUESTION_MESSAGE );
					// convierto el String del joptionpane a double
					altura = Double.parseDouble(alturastring);
				}
				// calculamos el area
				double areatr = (base*altura)/2;
				JOptionPane.showMessageDialog(null, "El area de tu triangulo es: " + areatr, "TRIANGULO", JOptionPane.INFORMATION_MESSAGE );
				break;
			} // Fin del caso 0
			
			case 1: {//El usuario elige calcular el área de un círculo
				JOptionPane.showMessageDialog(null, "Vamos a hacer el area de un circulo", "CIRCULO", JOptionPane.INFORMATION_MESSAGE );
				// hacemos lo mismo que con la base y la altura, pedimos un string y lo pasamos a double
				String radiostring =JOptionPane.showInputDialog(null, "Dime el radio de tu circunferencia", "CIRCULO", JOptionPane.QUESTION_MESSAGE);
				double radio = Double.parseDouble(radiostring);
				while (radio < 0) {
					JOptionPane.showMessageDialog(null, "El radio debe ser mayor de 0", "ERROR", JOptionPane.ERROR_MESSAGE );
					radiostring =JOptionPane.showInputDialog(null, "Dime el radio de tu circunferencia", "CIRCULO", JOptionPane.QUESTION_MESSAGE);
					radio = Double.parseDouble(radiostring);
				}
				double areacir = Math.PI*(Math.pow(radio, 2));
				JOptionPane.showMessageDialog(null, "El area de tu triangulo es: " + areacir, "TRIANGULO", JOptionPane.INFORMATION_MESSAGE );
				break;
			} //Fin del caso 1
			
			case 2: { //El usuario elige calcular la circunferencia
				JOptionPane.showMessageDialog(null, "Vamos a hacer la circunferencia de un circulo", "CIRCULO", JOptionPane.INFORMATION_MESSAGE );
				String radiostring = JOptionPane.showInputDialog(null, "Dime el radio de tu circunferencia", "CIRCULO", JOptionPane.QUESTION_MESSAGE);
				double radio = Double.parseDouble(radiostring);
				while (radio < 0) {
					JOptionPane.showMessageDialog(null, "El radio debe ser mayor de 0", "ERROR", JOptionPane.ERROR_MESSAGE );
					radiostring =JOptionPane.showInputDialog(null, "Dime el radio de tu circunferencia", "CIRCULO", JOptionPane.QUESTION_MESSAGE);
					radio = Double.parseDouble(radiostring);
				}
				double longitudcir = 2*Math.PI*radio;
				JOptionPane.showMessageDialog(null, "La circunferencia de tu triangulo es: " + longitudcir, "TRIANGULO", JOptionPane.INFORMATION_MESSAGE );
				break;
			} // Fin del caso 2
			
			case 3 : { //el usuario decide salir
				JOptionPane.showMessageDialog(null, "Adios =)", "Adios=)", JOptionPane.INFORMATION_MESSAGE );
			
			}// Fin del caso 3
			}// FIN DEL SWITCH
		} // fin del mientras opcion!=3
	} // Fin del método Ejercicio1

	
	/* Crear una aplicación que pida al usuario un número entero comprendido entre 10 y 9999 y 
	 * diga si es capicúa o no.
	 * Hay que tener en cuenta que el número no va a tener siempre el mismo número de cifras
	 */
	public static void ejercicio2() {

		String numeroej2 = JOptionPane.showInputDialog(null,"Dime un numero entre 10 y 9999 y te dire si es capicua","NUMEROS CAPICUA", JOptionPane.QUESTION_MESSAGE);
		int numeroej2int = Integer.parseInt(numeroej2);
		while (numeroej2int > 9999 || numeroej2int < 10) {
			JOptionPane.showMessageDialog(null, "El numero debe estar entre 10 y 9999", "ERROR", JOptionPane.ERROR_MESSAGE );
			numeroej2 = JOptionPane.showInputDialog(null,"Dime un numero entre 10 y 9999 y te dire si es capicua","NUMEROS CAPICUA", JOptionPane.QUESTION_MESSAGE);
		}
		int numeroinverso = 0;
		int numerotest = numeroej2int;
		while (numerotest != 0) {
			// haciendo el modulo entre 10 sacamos la ultima cifra del numero que nos ha dado el usuario
			int cifras = numerotest % 10;
			/* se lo sumamos al inverso pero multiplicandolo antes por 10
			 Ejemplo con 535: 535%10 = Resultado = 53, resto = 5. cifras aqui seria = 5 y numeroinverso seria = a 5*/
			numeroinverso = numeroinverso * 10 + cifras;
			// quitamos la ultima cifra al numero del usuario
			// aqui numerotest con el ejemplo de 535 seria igual a 53
			numerotest = numerotest /10;
			/* Segunda iteración del bucle: cifras = 5 numeroinverso = 5 numerotest = 53
			 * cifras = 53%10 = 3 numeroinverso = 5*10 + 3 = 53 numerotest = 53/10 = 5
			 */
		}
		if (numeroej2int == numeroinverso) {
			JOptionPane.showMessageDialog(null, "Es capicua", "NUMEROS CAPICUA", JOptionPane.INFORMATION_MESSAGE);
		}else 
			JOptionPane.showMessageDialog(null, "No es capicua", "NUMEROS CAPICUA", JOptionPane.INFORMATION_MESSAGE);
	}// Fin del método ejercicio2
	
	
	
	
	
	
	
} //Fin de la clase
	
