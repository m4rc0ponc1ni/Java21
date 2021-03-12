package ejercicios.ocho;



	import javax.swing.JOptionPane;
		
			
				public class witch2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int hermanos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos herman@s tienes?"));

	switch (hermanos) {

	case 0:
		JOptionPane.showMessageDialog(null, "Eres hijo único!!");
		break;
	case 1:
		JOptionPane.showMessageDialog(null, "Sois la pareja! :)");
	case 2:
		JOptionPane.showMessageDialog(null, "Ya sois familia numerosa!!");
		break;
	case 3:
		JOptionPane.showMessageDialog(null, "Parece que tienes con quién jugar, y de sobra...");
		break;
	case 4:
		JOptionPane.showMessageDialog(null, "Espero que os llevéis bien, mucha suerte...");
		break;
	default:
		JOptionPane.showMessageDialog(null, "En tu casa no hay TV ¿Verdad?");
		
	}
		}

	}
