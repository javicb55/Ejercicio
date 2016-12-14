import java.util.Scanner;
/** clase que nos muestra la secuencia de dos numeros dados
* @author Javier
* @version 1.0
*/
public class Ejercicio1A
{
	public static void main (String[] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int numeroMenor = in.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numeroMayor = in.nextInt();
		in.close();
		if (numeroMenor > numeroMayor)
		{
			int numeroMenorInicial = numeroMenor; //guardamos el 12
			numeroMenor = numeroMayor; // 6
			numeroMayor = numeroMenorInicial; //12
		}	 // al salir tenemos guardado 6 y 12
		if (numeroMenor == numeroMayor)
			System.out.printf("Has introducido el mismo numero para los dos números %d%n", numeroMenor);
		else 
		{ 
			//Con ESTO SE HACEN LAS COLUMNAS!!!!
			int contador = 1;
			for (int i = numeroMenor; i <= numeroMayor; i++)
			{
					System.out.printf("%5d", i);
				if  (contador % 2 == 0)
				
					System.out.println();
					contador ++;
			}
			System.out.println();
		}
			//imprimimos de forma ascendente.
		System.out.printf("El valor medio de %d y de %d es %.2f%n", numeroMenor, numeroMayor, calcularValorMedio(numeroMenor,numeroMayor));
	}
	public static double calcularValorMedio (int valorMenor, int valorMayor)
	{
		return (valorMenor +valorMayor)/2;
	}
}