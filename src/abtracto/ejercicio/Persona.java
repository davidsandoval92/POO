package abtracto.ejercicio;

public class Persona {

	public String nombre;
	public int edad;

	public Persona() {

	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		Integer edadObtenida = edad;
		return "Nombre: ".concat(this.getNombre()).concat(". Edad: ").concat(edadObtenida.toString());
	}

}
