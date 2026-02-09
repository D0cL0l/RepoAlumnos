import java.util.Random;

public class claseAlumnos {
	String nombre;
	int telefono, not1, not2, not3;

	public claseAlumnos(String nombre, int telefono) {
	this.nombre = nombre;
	this.telefono = telefono;
	}
	
	public void Notas() {
		Random rand = new Random();
		not1 = rand.nextInt(11);
		not2 = rand.nextInt(11);
		not3 = rand.nextInt(11);
		System.out.println(not1 + " " + not2 + " " + not3);
	}
	public void Media() {
		int media = (not1 + not2 + not3)/3;
		System.out.println(media);
	}
}

