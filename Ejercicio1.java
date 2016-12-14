/** Documentacion  del examen
-@author Javier
-@version 1.0
*/

//programa que imprime 3 numeros
// el primero indica el valor en el que empieza
// el segundo el incremento que se le va hacer
// el tercero el numero de columnas a mostrar
import java.util.Scanner;


public class Ejercicio1
{
	public static void main(String[] arg)
	{
		System.out.println("Inserte numero en el que empieza");
		Scanner in = new Scanner(System.in);
		int iniciador = in.nextInt();
		System.out.println("Inserte el numero de incremento");
		int incremento = in.nextInt();
		System.out.println("Indique el número de columnas"); // se como dividir en columnas.
		int numeroColumnas = in.nextInt();
		in.close();
		//controlo el número de columnas no sea negativo o 0.
	
		if (numeroColumnas <= 0)
			numeroColumnas = 2;
		mostrarEnPantalla(iniciador, incremento, numeroColumnas);
		
		
			
		
		
		
		
	}
	public static void mostrarEnPantalla(int iniciador, int incremento, int numeroColumnas)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%5d",iniciador);
			iniciador += incremento;
			//Contador de columnas.
			if (i % numeroColumnas == 0) // Usar dos == para hacer operaciones uno indica que es un boolean.
				System.out.println();
		}
		System.out.println();
	}
}