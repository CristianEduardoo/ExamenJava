import java.util.*;

public class RealizarMatricula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nombre;
		String respuesta = "si";
		boolean matriculaModuloUno, matriculaModuloDos, matriculaModuloTres, modulo;
		int importe;
		
		do {
			
			Matricula Alumno1 = new Matricula();
					
			System.out.println("Introduzca nombre del alumno:");
			Alumno1.setNombreAlumno(nombre = entrada.nextLine());
			
			
			System.out.println("Responda con (true/false). ¿Desea matricualarse en: Bases de datos?");
			Alumno1.setMatriculaModuloUno(matriculaModuloUno = entrada.nextBoolean());
			
			
			
			System.out.println("Responda con (true/false). ¿Desea matricualarse en: Lenguaje de Marcas?");
			Alumno1.setMatriculaModuloDos(matriculaModuloDos = entrada.nextBoolean());
			
			
			System.out.println("Responda con (true/false). ¿Desea matricualarse en: Programación?");
			Alumno1.setMatriculaModuloTres(matriculaModuloTres = entrada.nextBoolean());
			
			
			modulo = Alumno1.viabilidadMatricula(matriculaModuloUno, matriculaModuloDos, matriculaModuloTres);
			
			if (modulo == false) {
				
				System.out.println("Para formalizar la matrícula debe matricularse en al menos en un modulo");
			}
			
			entrada.nextLine();
			
			System.out.println("Responda con (Sí/No). ¿Desea repetir el proceso de matriculación? ");
			respuesta = entrada.nextLine();
			
			importe = Alumno1.calculaImporteMatricula();
			
			entrada.close();

		} while (respuesta.equalsIgnoreCase("si"));
		
		
		if (modulo == true) {
			
			System.out.println("El importe de la matricula de " + nombre + " es: " + importe + " €.");
			
		} else {
			
			System.out.println("No se calculó el importe de la matricula por no cumplir los requisitos ");
		}
		
		

	}

}
