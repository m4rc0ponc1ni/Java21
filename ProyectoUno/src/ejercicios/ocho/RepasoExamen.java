package ejercicios.ocho;
import java.util.Scanner;
public class RepasoExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero, multiplo;

Scanner sc = new Scanner (System.in);
System.out.println("Escribe un número");
numero = Integer.parseInt(sc.nextLine());
System.out.println("Introduce el número del que quieras saber si es múltiplo del primero");
multiplo = Integer.parseInt(sc.nextLine());

if (numero % multiplo == 0) {
	System.out.println(numero + " y " + multiplo + " son múltiplos");
} else {
	System.out.println("No es múltiplo");
}

int n1, n2, n3;
int a, b, c;

System.out.println("Escribe un número");
n1 = Integer.parseInt(sc.nextLine());
System.out.println("Escribe otro número");
n2 = Integer.parseInt(sc.nextLine());
System.out.println("Escribe un tercer numero");
n3 = Integer.parseInt(sc.nextLine());
if (n1>n2 && n1>n3) {
	a = n1;
	
	
	}else if (n2>n1 && n1>n3) {
		b = n1;
	}else if (n2>n1 && n3>n1) {
		c = n1;
		
	}else if (n2>n1 && n2>n3) {
		a = n2;
	}else if (n2>n1 && n3>n2) {
		b = n2;
	}else if (n1>n2 && n3>n2) {
		c = n2;
		
	}else if (n3>n1 && n3>n2) {
			a = n3;
	}else if (n3>n2 && n1>n3) {
		b = n3;
	}else if (n1>n3 && n2>n3) {
		c = n3;
		}
System.out.println("El orden de mayor a menor es " + a + ", " + b + ", " + c);




	}

}
