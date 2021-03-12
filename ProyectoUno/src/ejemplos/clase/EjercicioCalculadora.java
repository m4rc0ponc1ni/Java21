package ejemplos.clase;

import javax.swing.JOptionPane;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] menu = {"Suma", "Resta","Multiplicaci�n","Divisi�n","Potencia", "Raiz cuadrada", "Logartimo neperiano", "Logaritmo factorial","Salir"}; //Array para mostrar men�
		int eleccion = 0;
		while (eleccion!=8) {
			eleccion = JOptionPane.showOptionDialog(null, "�Qu� operaci�n quieres realizar?", "MEN�",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, // introduccion de datos que reconozca la opci�n del men� 
					menu, menu[8] );
			switch (eleccion) { // switch + breaks para entrar en cada caso elegido y que no continue con la ejecucion de los dem�s casos seguidos
			case 0: 
				int suma1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer n�mero"));
				int suma2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo n�mero"));
				JOptionPane.showMessageDialog(null, "El resultado de la suma es " + (suma1+suma2)); 
				break;
			case 1:
				int resta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer n�mero"));
				int resta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo n�mero"));
				JOptionPane.showMessageDialog(null, "El resultado de la resta es " + (resta1 - resta2));
				break;
			case 2:
				int multi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer n�mero"));
				int multi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo n�mero"));
				JOptionPane.showMessageDialog(null, "El resultado de la multiplicaci�n es " + (multi1 * multi2));
				break;
			case 3:																										// JOptionPane con IntegerParseInt para convertir cadena de texto en numero entero
				int divi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer n�mero"));
				int divi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo n�mero"));
				JOptionPane.showMessageDialog(null, "El resultado de la divisi�n es " + (divi1 / divi2));
				break;
			case 4:
				int pot1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la base del n�mero"));
				int pot2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el exponente del n�mero"));
				JOptionPane.showMessageDialog(null, "El resultado de elevar " + pot2 + " a " + pot1 + " es " + (Math.pow(pot1, pot2))); // Clase Math para calcular la potencia
				break;
			case 5:
				int raiz = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el n�mero del que quieres saber la ra�z"));
				JOptionPane.showMessageDialog(null, "El resultado de la raiz " + raiz + " es " + (Math.sqrt(raiz))); // clases Math para calcular la raiz
				break;
			case 6:
				int logn = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el n�mero del que quieres saber el logaritmo neperiano"));
				JOptionPane.showMessageDialog(null, "El resultado del logaritmo neperiano de " + logn + " es " + (Math.log(logn))); //Clase Math para calcular el logaritmo neperiano
				break;
			case 7:
				//int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el n�mero del que quieres el logaritmo factorial")); 
				// Este no sab�a como hacerlo. investigu� y s� que se puede hacer con un bucle for, pero no s� como hacerlo exactamente.
				
				JOptionPane.showMessageDialog(null, "Estamos trabajando en ello :(" );
				
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Hasta la pr�xima!" ); // Caso 8. Sale del programa al finalizar el bucle while del principio = 8
				//System.exit(0); 
			
			}
		}

	}

}