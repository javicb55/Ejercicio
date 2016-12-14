//programa para dividir la frase en palabras
//cuenta C, Z y palabras
//frase contatenada en mayúscula y minuscula


import java.util.Scanner;
public class Ejercicio2A
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("introduce una frase:");
		//convertimos la frase en minuscula y eliminamos
		//espacios en blanco al principio y al final
		String fraseMinuscula = in.nextLine().toLowerCase().trim();
		in.close();
		//Vamos a recorrer toda la frase caracter a caracter.
		//h
		//o
		//l
		//a
		int contadorC = 0;
		int contadorZ = 0;
		
		int contadorPalabra = 1;
		if (fraseMinuscula.length() == 0)
			contadorPalabra = 0;
		
		
		
		for (int i = 0; i < fraseMinuscula.length(); i++)
		
		{
			char caracter = fraseMinuscula.charAt(i);
			if (caracter == 'c')
			{
				contadorC++;
				continue;
			}
			if (caracter == 'z')
			{
				contadorZ++;
				continue;
			}
			//Cuenta palabras
			if (caracter == ' ' && fraseMinuscula.charAt(i+1) != ' ')
			{
				contadorPalabra++;
			}
		}
		System.out.printf("La frase %s tiene %d c, %d z y %d palabras%n", fraseMinuscula, contadorC, contadorZ, contadorPalabra);
		System.out.printf("%s%n", fraseMinuscula+fraseMinuscula.toUpperCase());
		
	}
}