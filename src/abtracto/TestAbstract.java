package abtracto;

import java.util.Calendar; //Ejemplo aprenderaprogramar.com

public class TestAbstract {

	public static void main(String[] Args) {

		Calendar fecha1 = Calendar.getInstance();

		fecha1.set(2019, 10, 22); // Los meses van de 0 a 11, luego 10 representa noviembre

		ProfesorInterino pi1 = new ProfesorInterino("Jos�", "Hern�ndez L�pez", 45, "45221887-K", fecha1);

		ProfesorInterino pi2 = new ProfesorInterino("Andr�s", "Molt� Parra", 87, "72332634-L", fecha1);

		ProfesorInterino pi3 = new ProfesorInterino("Jos�", "R�os Mesa", 76, "34998128-M", fecha1);

		ProfesorTitular pt1 = new ProfesorTitular("Juan", "P�rez P�rez", 23, "73-K");

		ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Mota", 49, "88-L");

		ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa Mota", 49, "81-F");

		ListinProfesores listinProfesorado = new ListinProfesores();

		listinProfesorado.addProfesor(pi1);
		listinProfesorado.addProfesor(pi2);
		listinProfesorado.addProfesor(pi3);

		listinProfesorado.addProfesor(pt1);
		listinProfesorado.addProfesor(pt2);
		listinProfesorado.addProfesor(pt3);

		listinProfesorado.imprimirListin();

		System.out.println("El importe de las n�minas del profesorado que consta en el list�n es " +

				listinProfesorado.importeTotalNominaProfesorado() + " euros");

	}
} // Cierre del main y cierre de la clase