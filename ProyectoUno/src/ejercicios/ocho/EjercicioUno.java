package ejercicios.ocho;

import javax.swing.JOptionPane;

public class EjercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double base, altura, radio, resultadotriangulo, resultadocirculo;
 int operacion = 0;
		while (operacion!= 3) {
	operacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opción: 1- área del triángulo. 2- circunferencia de un círculo. 3- Salir"));
	switch (operacion) {
	case 1: 
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la base del triángulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la altura del triángulo"));
		resultadotriangulo = base*altura/2;
	JOptionPane.showMessageDialog(null, "El área del triángulo es " + resultadotriangulo);
	break;
	case 2:
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el radio del círculo"));
		resultadocirculo = (radio*2)*Math.PI;
		JOptionPane.showMessageDialog(null, "La circunferencia del círculo es " + resultadocirculo);
	}
	}
	}

}
