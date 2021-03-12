import javax.swing.JOptionPane;

public class EjercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog(null, "Introduce un numero del 1 al 7 ","Averigua el día de la semana", JOptionPane.QUESTION_MESSAGE);
		int d = Integer.parseInt(dia);
		
        if (d == 1) {
		JOptionPane.showMessageDialog(null, "Hoy es  Lunes ");
	} else if (d == 2) {
		JOptionPane.showMessageDialog(null, "H es Martes ");
	} else if (d == 3) {
		JOptionPane.showMessageDialog(null, "Hoy es Miércoles ");
	} else if (d == 4) {
		JOptionPane.showMessageDialog(null, "Hoy es Jueves ");
	} else if (d == 5) {
		JOptionPane.showMessageDialog(null, "Hoy es Viernes ");
	} else if (d == 6) {
		JOptionPane.showMessageDialog(null, "Hoy es Sábado ");
	}else {
			JOptionPane.showMessageDialog(null, "Hoy es Domingo ");
		}
		
	}
	}


