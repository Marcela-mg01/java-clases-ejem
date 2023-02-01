package paqueteejemplo;
public class Integrantes{
	public String Asignatura, Seccion, Docente, Alumno1, Alumno2, Alumno3, Alumno4, Carnet;
	public void DatosIntegrantes(){
		Asignatura="Programacion Orientada a Objetos";
		Seccion="02";
		Docente= "Lilian ";
		Alumno1= "Marcela";
		Alumno2= "Adriana";
		Alumno4= "Monica";
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^	                UNIVERSIDAD.	                ^");		
		System.out.println("^	FACULTAD: Informatica y Ciencias Aplicadas	    ^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Asignatura: "+Asignatura);
		System.out.println("Seccion: "+Seccion);
		System.out.println("Docente: "+Docente);
		
		System.out.println("=============================================================");
		
		Carnet= "27-3248-2020";
		System.out.println("Alumno: "+Alumno1);
		System.out.println("Carnet: "+Carnet);
		
		System.out.println("=============================================================");
		Carnet= "27-3255-2020";
		System.out.println("Alumno: "+Alumno2);
		System.out.println("Carnet: "+Carnet);
		
		System.out.println("=============================================================");
		Carnet= "27-3257-2020";
		System.out.println("Alumno: "+Alumno4);
		System.out.println("Carnet: "+Carnet);
		System.out.println(" ");
	}
}