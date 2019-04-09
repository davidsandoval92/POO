package abtracto.ejercicio;

public class Diputado extends Legislador {

	public Diputado() {
		super();
	}

	public Diputado(String provinciaQueRepresenta, int edad, String nombre) {
		super(provinciaQueRepresenta, edad, nombre);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		return "Diputados";
	}

	@Override
	public String toString() {

		return super.toString().concat("-Trabaja en la camara de:").concat(this.getCamaraEnQueTrabaja());

	}

}
