import javax.swing.JOptionPane;

public class EjercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu [] = {"hola", "hola2", "salir"};
		int eleccion = 0;
		eleccion = JOptionPane.showOptionDialog(null, "¿Qué operación quieres realizar?", "MENÚ",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, menu, menu [0]);
}
}