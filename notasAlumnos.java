import java.util.Random;
import java.util.Scanner;

public class notasAlumnos {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un nombre y telefono:");
		String nombre = sc.nextLine();
		int telefono = sc.nextInt();

		claseAlumnos alumno = new claseAlumnos(nombre, telefono);
		alumno.Notas();	
		alumno.Media();
	}
}

