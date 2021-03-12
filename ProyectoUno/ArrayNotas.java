package ejercicios_teoria_arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ArrayNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Icon imagen = new ImageIcon("imagenes/notas.png");
		
		JOptionPane.showMessageDialog(null, "Introduce las notas del alumno en siguiente orden:"
				+ "\n - Primer trimestre"
				+ "\n - Segundo trimestre"
				+ "\n - Tercer trimestre"
				+ "\n - Cuarto trimestre", "Introducir notas", JOptionPane.INFORMATION_MESSAGE, imagen);
		
		double[] notas = new double [4];
		String ordinal = "";
		
		// Con este FOR introduzco las notas en el array
		for (int i = 0; i<4; i++) {
			// Este switch es para que quede bonito el mensaje con el ordinal correspondiente
			switch (i) {
			case 0: ordinal = " primer trimestre ";
					break;
			case 1: ordinal = " segundo trimestre ";
					break;
			case 2: ordinal = " tercer trimestre ";
					break;
			case 3: ordinal = " cuarto trimestre ";
					break;
			}//del switch
			
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la nota del" + ordinal + "del alumno"));
		} //del for
		
		// Recorro el array con un bucle FOR y voy mostrando las notas por consola
		System.out.println("Muestro las notas con bucle FOR"); 
		for (int i = 0; i<4; i++) {								
			System.out.print(notas[i] + "  "); 
		} 
		
		System.out.println(""); 

		// Recorro el array con un bucle FOR-EACH y voy mostrando las notas por consola
		System.out.println("Muestro las notas con bucle FOR-EACH"); 
		for (double nota:notas) {								
			System.out.print(nota + "  "); 
		} 
	}
}

