package abtracto.ejercicio;

public abstract class Legislador extends Persona {

	public Legislador() {
		super();
	}

	public Legislador(String provinciaQueRepresenta, int edad, String nombre) {
		super(nombre, edad);
		this.provinciaQueRepresenta = provinciaQueRepresenta;
	}

	public String provinciaQueRepresenta;

	public String getProvinciaQueRepresenta() {
		return provinciaQueRepresenta;
	}

	public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
		this.provinciaQueRepresenta = provinciaQueRepresenta;
	}

	public abstract String getCamaraEnQueTrabaja();

}
