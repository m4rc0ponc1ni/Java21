package ejemplos.clase;

import javax.swing.JOptionPane;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] menu = {"Suma", "Resta","Multiplicación","División","Potencia", "Raiz cuadrada", "Logartimo neperiano", "Logaritmo factorial","Salir"}; //Array para mostrar menú
		int eleccion = 0;
		while (eleccion!=8) {
			eleccion = JOptionPane.showOptionDialog(null, "¿Qué operación quieres realizar?", "MENÚ",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, // introduccion de datos que reconozca la opción del menú 
					menu, menu[8] );
			switch (eleccion) { // switch + breaks para entrar en cada caso elegido y que no continue con la ejecucion de los demás casos seguidos
			case 0: 
				int suma1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
				int suma2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));
				JOptionPane.showMessageDialog(null, "El resultado de la suma es " + (suma1+suma2)); 
				break;
			case 1:
				int resta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
				int resta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));
				JOptionPane.showMessageDialog(null, "El resultado de la resta es " + (resta1 - resta2));
				break;
			case 2:
				int multi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
				int multi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));
				JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es " + (multi1 * multi2));
				break;
			case 3:																										// JOptionPane con IntegerParseInt para convertir cadena de texto en numero entero
				int divi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
				int divi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));
				JOptionPane.showMessageDialog(null, "El resultado de la división es " + (divi1 / divi2));
				break;
			case 4:
				int pot1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la base del número"));
				int pot2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el exponente del número"));
				JOptionPane.showMessageDialog(null, "El resultado de elevar " + pot2 + " a " + pot1 + " es " + (Math.pow(pot1, pot2))); // Clase Math para calcular la potencia
				break;
			case 5:
				int raiz = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del que quieres saber la raíz"));
				JOptionPane.showMessageDialog(null, "El resultado de la raiz " + raiz + " es " + (Math.sqrt(raiz))); // clases Math para calcular la raiz
				break;
			case 6:
				int logn = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del que quieres saber el logaritmo neperiano"));
				JOptionPane.showMessageDialog(null, "El resultado del logaritmo neperiano de " + logn + " es " + (Math.log(logn))); //Clase Math para calcular el logaritmo neperiano
				break;
			case 7:
				//int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del que quieres el logaritmo factorial")); 
				// Este no sabía como hacerlo. investigué y sé que se puede hacer con un bucle for, pero no sé como hacerlo exactamente.
				
				JOptionPane.showMessageDialog(null, "Estamos trabajando en ello :(" );
				
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Hasta la próxima!" ); // Caso 8. Sale del programa al finalizar el bucle while del principio = 8
				//System.exit(0); 
			
			}
		}

	}

}