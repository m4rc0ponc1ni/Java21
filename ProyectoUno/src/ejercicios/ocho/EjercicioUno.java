package ejercicios.ocho;

import javax.swing.JOptionPane;

public class EjercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double base, altura, radio, resultadotriangulo, resultadocirculo;
 int operacion = 0;
		while (operacion!= 3) {
	operacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opci�n: 1- �rea del tri�ngulo. 2- circunferencia de un c�rculo. 3- Salir"));
	switch (operacion) {
	case 1: 
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la base del tri�ngulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la altura del tri�ngulo"));
		resultadotriangulo = base*altura/2;
	JOptionPane.showMessageDialog(null, "El �rea del tri�ngulo es " + resultadotriangulo);
	break;
	case 2:
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el radio del c�rculo"));
		resultadocirculo = (radio*2)*Math.PI;
		JOptionPane.showMessageDialog(null, "La circunferencia del c�rculo es " + resultadocirculo);
	}
	}
	}

}
