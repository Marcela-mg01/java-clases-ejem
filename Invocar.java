import paqueteejemplo.*;
import java.util.Scanner;
public class Invocar
{
	Scanner leer = new Scanner(System.in);
	public void met1(){
		int r, r2, resp;
		do{
			System.out.println("\nIngrese el numero correspondiente segun el siguiente menu: ");
			System.out.println("1.Clase \"Estructuras de control\" \n2.Clase \"Alumnos\" \n3.Clase \"Evaluaciones\"\n4.Integrantes");
			System.out.print("Respuesta: ");
			r= leer.nextInt();
			switch (r){
			//Clase Estructuras de control
			case 1:
				EstructurasDeControl obj1 = new EstructurasDeControl();
				System.out.println("\nIngrese el numero segun el siguiente menu para lo que desea ver");
				System.out.println("1.Estructura selectiva Simple\n2.Estructura selectiva Doble\n3.Estructura selectiva Multiple");
				System.out.println("4.Estructura Repetitiva While\n5.Estructura Repetitiva For");
				r2 = leer.nextInt();
				switch (r2){
					case 1:
					obj1.Simple();
					break;
					case 2:
					obj1.Doble();
					break;
					case 3:
					obj1.Multiple();
					break;
					case 4:
					obj1.RepetitivaWhile();
					break;
					case 5:
					obj1.RepetitivasFor();
					break;
					default:
					System.out.println("Ingreso un numero inexistente en el menu\nPor favor vuelve a intentarlo");
					break;
				}
				break;
			//Clase Alumno
			case 2:
				Scanner leer2 = new Scanner(System.in);
				Alumnos obj2 = new Alumnos();
				System.out.print("------------------\nIngrese su nombre: ");
				String nombre = leer2.nextLine();
				System.out.print("Ingrese su apellido: ");
				String apellido =  leer2.nextLine();
				System.out.print("Ingrese su numero de carnet: ");
				String Ncarnet=leer2.nextLine();
				System.out.print("Ingrese su carrera: ");
				String carrera= leer2.nextLine();
				System.out.print("Ingrese su facultad: ");
				String facultad= leer2.nextLine();
				System.out.println("---------------------");
				Alumnos.Datos_Alumnos(nombre,apellido,Ncarnet);
				Alumnos.CarreraAlumno(carrera,"Ciclo 02",facultad);
				Alumnos.MateriasAcursar("Son 10 materias");
				System.out.println("---------------------\n");
				
				break;
			//Clase Evaluaciones
			case 3:
				Evaluaciones obj3 = new Evaluaciones();
				obj3.lecturaDatos();
				break;
			//Clase Integrantes
			case 4:
				Integrantes obj4 = new Integrantes();
				obj4.DatosIntegrantes();
				break;
			default:
				System.out.println("Ingreso un numero inexistente en el menu\n");
				break;
			}
			System.out.println("\nDesea ver otra clase? \nIngrese \"1\" si desea continuar \nIngrese \"2\" si desea finalizar");
			System.out.print("Respuesta: ");
			resp=leer.nextInt();
		}
		while(resp==1);
		
		System.out.print("\t*****************Gracias por usar nuestro sistema...!!!*****************");
		
	}
	
	
}