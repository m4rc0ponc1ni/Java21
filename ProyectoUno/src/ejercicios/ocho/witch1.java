package ejercicios.ocho;

import javax.swing.JOptionPane;

public class witch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String [] opciones = {"Premios", "hermanos","Salir"}; //array para crear el men�
		
		int opcion =0; //Valor asignado a la opci�n en un principio
		
		while (opcion!=2) { // Bucle que ejecuta el programa mientras la opci�n no sea salir
			
			opcion = JOptionPane.showOptionDialog(null, "Elige una opci�n", "Hermanos y premios",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
							opciones, opciones[1] ); // men� para seleccionar que queremos saber
			
			switch (opcion){ // switch que entra en cada caso dependiendo de la opci�n seleccionada
			case 0: {
					medalla(); // Llama a la primera opci�n m�s abajo
					break; // sale del caso
			}
			case 1: { // entra en el segundo caso
				hijos();// llama a la segunda opci�n
			}	break;// sale del caso
			case 2: { // caso 2 cumple el while y se ejecuta el mensaje de despedida
				JOptionPane.showMessageDialog(null, "Hasta pronto!");
			}
					
			}
			}}
			

			
			
			
			
			
			
			
			
			
			
			public static void medalla () { // metodo para poder ser llamado 
			
			
			int puesto = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la posici�n")); // Introduccion de una cadena almacenado en un numero entero para poder seleccionar el caso en el switch

switch (puesto) { 

case 1:
	JOptionPane.showMessageDialog(null, "Medalla de oro!");
	break;
case 2:
	JOptionPane.showMessageDialog(null, "Medalla de plata");
	break;
case 3:
	JOptionPane.showMessageDialog(null, "Medalla de bronce!");
	break;
case 4:
	JOptionPane.showMessageDialog(null, "Trofeo y diploma!!");
	break;
case 5:
	JOptionPane.showMessageDialog(null, "Diploma!!");
	break;
default:
	JOptionPane.showMessageDialog(null, "Premio de consolaci�n :(");
	
}
	}


			public static void hijos () { // metodo para poder ser llamado  
			
			int hermanos = Integer.parseInt(JOptionPane.showInputDialog(null, "�Cu�ntos herman@s tienes?"));

			switch (hermanos) {

			case 0:
				JOptionPane.showMessageDialog(null, "Eres hijo �nico!!");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Sois la pareja! :)");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Ya sois familia numerosa!!");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Parece que tienes con qui�n jugar, y de sobra...");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Espero que os llev�is bien, mucha suerte...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "En tu casa no hay TV �Verdad?");
				
			}
				}

			}
