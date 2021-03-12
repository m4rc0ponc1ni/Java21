import javax.swing.JOptionPane;

public class EjercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
String nota1 = JOptionPane.showInputDialog(null, "Introduce una nota del uno al diez","", JOptionPane.QUESTION_MESSAGE);
String nota2 = JOptionPane.showInputDialog(null, "Introduce la segunda nota","", JOptionPane.QUESTION_MESSAGE);
String nota3 = JOptionPane.showInputDialog(null, "Introduce la tercer nota","", JOptionPane.QUESTION_MESSAGE);
int n1 = Integer.parseInt(nota1);
int n2 = Integer.parseInt(nota2);
int n3 = Integer.parseInt(nota3);
int media = (n1 + n2 + n3)/3;

if (media >= 5) {
JOptionPane.showMessageDialog(null, "Felicidades, has aprobado con un " + media, "Resultado media", JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(null, "Lo siento, has suspendido con un " + media, "Resultado media", JOptionPane.INFORMATION_MESSAGE);	
}

	}

}
