package abtracto.ejercicio;

public class Senador extends Legislador {

	public Senador() {
		super();
	}

	public Senador(String provinciaQueRepresenta, int edad, String nombre) {
		super(provinciaQueRepresenta, edad, nombre);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		return "Senadores";
	}

	@Override
	public String toString() {
		return super.toString().concat("-Trabaja en la camara de:").concat(this.getCamaraEnQueTrabaja());
	}

}
