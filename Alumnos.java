package paqueteejemplo;
import java.util.Scanner;
public class Alumnos
{
	Scanner leer = new Scanner(System.in);
	public static void Datos_Alumnos(String nombre, String apellido, String Ncarnet)
	{
		System.out.println("Bienvenido!!");
		System.out.println("Su nombre es: "+nombre+"\nSu apellido es: "+apellido+"\nSu numero de carnet: "+Ncarnet);
	}
	
	public static void CarreraAlumno(String carrera, String ciclo, String facultad)
	{
		String c= carrera;
		String ci= ciclo;
		String f= facultad;
		System.out.println("nombre de la carrera: "+c+"\nciclo: " +ci+ "\nfalcultad de la carrera: "+f);
	}
	
	public static void MateriasAcursar(String materia_cursada)
	{
		System.out.println("La cantidad de materias que usted a Cursado son: "+materia_cursada);
	}
	
}