package abtracto.ejercicio;

import java.util.ArrayList;

public class ListinLegisladores {

	private ArrayList<Legislador> listinLegisladores;

	public ListinLegisladores() {
		this.listinLegisladores = new ArrayList<Legislador>();
	}

	public void addLegislador(Legislador legislador) {
		this.listinLegisladores.add(legislador);
	}

	public void imprimirLegisladores() {
		String tipoLegislador;
		for (Legislador legislador : listinLegisladores) {
			System.out.println(legislador.toString());
			if (legislador instanceof Diputado) {
				tipoLegislador = "Diputado";
			} else {
				tipoLegislador = "Senador";
			}

			System.out.println("Tipo de legislador:".concat(tipoLegislador));
		}
	}

}
