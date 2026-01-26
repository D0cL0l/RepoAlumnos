import java.util.Random;

public class claseAlumnos {
	String nombre;
	int telefono, edad, not1, not2, not3;

	public claseAlumnos(String nombre, int edad, int telefono) {
	this.nombre = nombre;
	this.edad = edad;
	this.telefono = telefono;
	}
	
	public void Notas() {
		Random rand = new Random();
		not1 = rand.nextInt(11);
		not2 = rand.nextInt(11);
		not3 = rand.nextInt(11);
		System.out.println(not1 + " " + not2 + " " + not3);
	}
}

