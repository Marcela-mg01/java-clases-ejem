package paqueteejemplo;
import java.util.Scanner;
public class Evaluaciones
{
	
	private double n1,n2,n3,n4,n5;
	public int r;
	Scanner leer = new Scanner(System.in);
	
	private double prom(){
		return (n1+n2+n3+n4+n5)/5;
	}

	private String mensaje(){
		return "capturando datos...";
	}
	
	public void lecturaDatos(){
		do{
			System.out.println("-----------------------");
			System.out.println(mensaje());
			System.out.print("Ingrese la nota 1: ");
			n1=leer.nextDouble();
			System.out.print("Ingrese la nota 2: ");
			n2=leer.nextDouble();
			System.out.print("Ingrese la nota 3: ");
			n3=leer.nextDouble();
			System.out.print("Ingrese la nota 4: ");
			n4=leer.nextDouble();
			System.out.print("Ingrese la nota 5: ");
			n5=leer.nextDouble();
			mostrarProm();
			AprobadoReprobado();
			System.out.println("\n_________________________");
			System.out.println("Desea continuar ingresando mas notas?\nIngrese \"1\" desea continuar\nIngrese \"2\" si desea finalizar");
			r = leer.nextInt();
			System.out.println("_________________________\n");
			
		}while(r==1);
		mensaje1();
	}
	
	private void AprobadoReprobado(){
		if (prom()>=6)
			System.out.println("Usted esta aprobado");
		else 
			System.out.println("Usten no esta aprobado");
	}
	
	private void mostrarProm(){
		System.out.println(prom());
	}
	
	private void mensaje1(){
		System.out.println("*****Gracias por usar nuestro programa...*****");
	}
	
}