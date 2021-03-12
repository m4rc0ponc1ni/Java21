package ejercicios.ocho;

import javax.swing.JOptionPane;

public class Ar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] semana = new String [7];
		
		for (int i = 0; i<7; i++) {
			
			semana [i] = JOptionPane.showInputDialog(null, "Introduce el día de la semana");
		System.out.println("has elegido: " + semana[i]  );
		
double [] temperatura = new double [3];
		
		for (int a = 0;a<3; a++) {
			temperatura[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce las temperaturas"));
			System.out.println("temperatura: " + temperatura[a]);
		}
		
		
			
		}
	}

}
