import java.util.Random;
import java.util.Scanner;
public class notasAlumnos {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un nombre, edad y telefono:");
		String nombre = sc.nextLine();
		int edad = sc.nextInt();
		int telefono = sc.nextInt();

		claseAlumnos alumno = new claseAlumnos(nombre, edad, telefono);
		alumno.Notas();	
	}
}

