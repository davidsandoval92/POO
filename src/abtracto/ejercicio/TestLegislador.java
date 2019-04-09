package abtracto.ejercicio;

public class TestLegislador {
	
	public static void main (String[] Args) {
		System.out.println("Esta es la informacion de los legisladores.");
		
		Diputado diputadoTolima = new Diputado("Tolima", 35, "Rodolfo Sandoval");
		Diputado diputadoMeta = new Diputado("Meta", 45, "Liliana Penagos");
		Diputado diputadoCundinamarca = new Diputado("Cundinamarca", 60, "Natalia Sandoval");
		
		Senador senadorTolima = new Senador("Tolima", 24, "Daniel Lozada");
		Senador senadorMeta = new Senador("Meta", 48, "Maria Torres");
		Senador senadorCundinamarca = new Senador("Cundinamarca", 33, "Angela Bustamante");
		
		ListinLegisladores listin = new ListinLegisladores();
		listin.addLegislador(diputadoTolima);
		listin.addLegislador(diputadoMeta);
		listin.addLegislador(diputadoCundinamarca);
		
		listin.addLegislador(senadorTolima);
		listin.addLegislador(senadorMeta);
		listin.addLegislador(senadorCundinamarca);
		
		listin.imprimirLegisladores();
		
	}

}
