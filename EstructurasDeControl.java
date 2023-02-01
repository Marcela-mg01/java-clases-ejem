package paqueteejemplo;
import java.util.Scanner;
public class EstructurasDeControl
{
	public int edad, num, resp, n, c, r, f, i;
	public double salario, aumento, totals;
	Scanner ec = new Scanner(System.in);
	
	public void Simple()
	{
		System.out.print("Ingrese \"1\" si usted estudia \"2\" si usted trabaja: ");
		resp = ec.nextInt();
		System.out.println("_____________________________");
		if (resp == 1){
			System.out.println("Este es un ejemplo de una estructura \"Selectiva Simple\"");
			System.out.println("Usted aun es estudiante\n");
		}
		System.out.println("Gracias por su respuesta!!");
		System.out.println("_____________________________\n");
	}

	Scanner db = new Scanner(System.in);
	public void Doble()
	{
		System.out.print("Ingrese su edad: ");
		edad = db.nextInt();
		System.out.println("_____________________________");
		System.out.println("Este es un ejemplo de una estructura \"Selectiva Doble\"");
		if (edad >= 18){
			System.out.println("Usted es mayor de edad");
		}
		else{
			System.out.println("Usted es menor de edad");
		}
		System.out.println("_____________________________\n");
	}
	Scanner mul = new Scanner(System.in);
	public void Multiple()
	{
		
		System.out.println("Ingrese el numero segun el siguiente menu: ");
		System.out.println("\t1.Si usted estudia una Licenciatura\n\t2.Si su usted estudia Ingenieria\n\t3.Si usted un tecnico");
		System.out.print("Respuesta: ");
		num = mul.nextInt();
		
		System.out.println("\n__________________________________________________________");
		System.out.println("Este es un ejemplo es estructura \"Selectiva multiple\" por if");
		if (num==1)
		{
			System.out.println("Usted estudia una licenciatura, Felicidades!! Sigue adelante. Son 5 a\u00f1os de carrera");
		}
		else if (num==2)
		{
			System.out.println("Usted estudia una ingenieria, Felicidades!! Sigue adelante. Son 5 a\u00f1os de carrera que te encataran vivir");
		}
		else if (num==3)
		{
			System.out.println("Usted estudia un Tecnico, Felicidades!! Sigue adelante. Son 2 a\u00f1os de carrera que te encataran vivir");
		}
		else
		{
			System.out.println("El numero que usted ingreso no existe en el men\u00fa");
		}
		System.out.println("__________________________________________________________\n");
		
		System.out.println("¿Desea usted saber curiosidades sobre los meses del a\u00f1o? \nIngrese el numero segun el siguiente menu: ");
		System.out.println("1.Enero 		2.Febrero 		3.Marzo");
		System.out.println("4.Arbil 		5.Mayo 			6.Junio");
		System.out.println("7.Julio 		8.Agosto 		9.Septiembre");
		System.out.println("10.Octubre 		11.Noviembre 		12.Diciembre");
		System.out.print("Respuesta: ");
		n= mul.nextInt();
		
		System.out.println("\n__________________________________________________________");
		System.out.println("Este es un ejemplo es estructura \"Selectiva multiple\" por switch");
		
		switch (n){
			case 1:
				System.out.println("Es el mes de Enero\nUn dato curioso es que estaba consagrado a \"janus\" es un dios romano.");
				System.out.println("es el dios de las puertas, principios y finales. Se llama asi porque es el mes que abre el a\u00f1o.");
				break;
			case 2:
				System.out.println("Es el mes de Febrero\nUn dato curioso es que el nombre proviene \"Februo\" lo cual significa Limpiarse");
				System.out.println("El mes de febrero se llamo asi porque los romanos realizaban en este mes algunos ritos que implicaban pureza.");
				break;
			case 3:
				System.out.println("Es el mes de Marzo\nUn dato curioso es que proviene de \"Martivs\" en honor a marte. Marzo era el primer mes del Calendario Romano antiguo");
				System.out.println("Por ello decidieron llamarle de esta forma, ya que es el dios de la Guerra y en marzo se planeaban las campañas militares.  ");
				break;
			case 4:
				System.out.println("Es el mes de Abril\nUn dato curioso es que proviene de la palabra \"aperio\" cuyo significado es abrir");
				System.out.println("Abril es el mes en el que las plantas florecen, por ello los romanos lo llamaron Aprilis.");
				break;
			case 5:
				System.out.println("Es el mes de Mayo\nUn dato curioso es que proviene de \"Maivs\", en referencia a la diosa Maia");
				System.out.println("Es considerada la diosa de la primavera. El día 1 de mayo se ofrecian los sacrificios a la diosa Maia.");
				break;
			case 6:
				System.out.println("Es el mes de Junio\nUn dato curioso es que proviene de \"Ivnonis\" y fue llamado asi honor a la diosa del matrimonio, juno");
				break;
			case 7:
				System.out.println("Es el mes de Julio\nUn dato curioso es que proviene de \"Ivlivs\" en honor a Julio Cesar que nacio en julio");
				System.out.println("Aunque en un primer momento se llamaba \"Quintilis\" por ser el quinto mes.");
				break;
			case 8:
				System.out.println("Es el mes de Agosto\nUn dato curioso es que proviene de \"Avgvstvs\" en honor al emperador Augusto. ");
				System.out.println("Agosto también se conocía como \"Sextilis\" hasta que se cambió con el calendario Juliano.");
				break;
			case 9:
				System.out.println("Es el mes de Septiembre\nUn dato curioso es que el nombre proviene de \"Septembri\" ");
				System.out.println("Es por el orden en que los romanos contaban los meses en el calendario, en el que marzo era el primero. Es uno de cuatro meses gregorianos con 30 días.");
				break;
			case 10:
				System.out.println("Es el mes de Octubre\nUn dato curioso es que el nombre proviene de \"Octobri\" ");
				System.out.println("Es por el orden en que los romanos contaban los meses en el calendario, en el que marzo era el primero.");
				System.out.println("En la antigua Inglaterra, octubre fue llamado una vez Winmonth, que significa el mes del vino.");
				break;
			case 11:
				System.out.println("Es el mes de Noviembre\nUn dato curioso es que el nombre proviene de \"Novembris\" ");
				System.out.println("Es por el orden en que los romanos contaban los meses en el calendario, en el que marzo era el primero.");
				break;
			case 12:
				System.out.println("Es el mes de Diciembre\nUn dato curioso es que el nombre proviene de \"Decimo\" ");
				System.out.println("Es por el orden en que los romanos contaban los meses en el calendario, en el que marzo era el primero.");
				break;
			default:
				System.out.println("Ingreso un numero que no estaba en el menu");
			break;
		}
		System.out.println("__________________________________________________________\n");
	}
	
	Scanner wh = new Scanner(System.in);
	public void RepetitivaWhile()
	{
		System.out.println("**Este es un ejemplo de repetitiva do while**");
		do{
			System.out.print("Ingrese un numero cualquiera para saber si es par, impar o cero: ");
			c = wh.nextInt();
			
			if(c==0)
			{
				System.out.println("El numero es cero");
			}
			else if(c%2==0)
			{
				System.out.println("El numero es par");
			}
			else
			{
				System.out.println("El numero es impar");
			}
			System.out.println("\n_____________________________");
			System.out.println("Desea continuar?\nIngrese 1 si quiere continuar\nIngrese 2 si quiere finalizar");
			System.out.print("Respuesta: ");
			r = wh.nextInt();
			System.out.println("_____________________________\n");
			
		}while(r==1);
		System.out.println("Gracias por usar nuestro programa...");
	}
	
	Scanner fr = new Scanner(System.in);
	public void RepetitivasFor()
	{
		System.out.println("**Este es un ejemplo de repetitiva For**");
		System.out.print("Ingrese el numero de datos que va a ingresar: ");
		f = fr.nextInt();
		
		for(i=0; i<f; i++)
		{
			System.out.print((i+1)+". Ingrese el salario del trabajador: $");
			salario = fr.nextDouble();
			
			if(salario>0)
			{
				System.out.println("\n_____________________________");
				if (salario<=300)
				{
					aumento = salario * 0.25;
					totals = aumento+salario;
					System.out.println("El descuento es: 25%");
				}
				else if (salario>300 & salario<=600)
				{
					aumento = salario * 0.20;
					totals = aumento+salario;
					System.out.println("El descuento es de: 20%");
				}
				else if (salario>600 & salario<=1000)
				{
					aumento = salario * 0.10;
					totals = aumento+salario;
					System.out.println("El descuento es de: 10%");
				}
				else 
				{
					aumento = salario * 0.05;
					totals = aumento+salario;
					System.out.println("El descuento es de: 5%");
				}
				
				System.out.println("El aumento del trabajador "+(i+1)+" es: $"+aumento+"\nY el total a pagar a el trabajador es: $"+totals);
				System.out.println("_____________________________\n");
			}
			else
			{
				System.out.println("El salario no es valido, ya sea porque es 0 o porque es negativo\nVuelve a intentarlo...\n");
				i--;
			}
		}
		
		
	}
	
}