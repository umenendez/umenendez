import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner txt = new Scanner(System.in)) {
			String entrada;
			Double nota;
			Double notas = (double) 0;
			Integer contador;
			do {
				System.out.print("Introduce el número de asignaturas: ");
				entrada = txt.nextLine();
				contador = Integer.parseInt(entrada);
				if (contador <=0) {
					System.out.println("Debe ser mayor que 0");
				}
			} while (contador <=0);
			for (int i = 1; i <= contador; i++) {
				do {
					System.out.print("Introduce la nota de la asignatura " + i + " (0 - 10):");
					entrada = txt.nextLine();
					nota = Double.parseDouble(entrada);
					if (nota <=0) {
						System.out.println("La nota debe ser mayor que 0");
					} else if (nota >10) {
						System.out.println("La nota debe ser menor que 10");
					}
				} while (nota <=0 || nota > 10);
				notas = notas + nota;
			}
			System.out.println("La media del alumno es: "+ notas/contador);
			System.out.print("Valoración: ");
			if (notas/contador <5) {
				System.out.println("Suspenso");
			}else if (notas/contador <7) {
				System.out.println("Aprobado");
			}else if (notas/contador <9) {
				System.out.println("Notable");
			}else {
				System.out.println("Sobresaliente");
			}
			
			
		}
	}

}
