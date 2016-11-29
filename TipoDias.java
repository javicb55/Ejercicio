
import java.util.Scanner;
/** Clase que leido un dia de la semana 
*Nos dice si es laborable o no
*-@author Javi
*-version1.0
*/

public class TipoDias{
	public static void main (String[] arg){
		System.out.println("Introduce un dia de la semana");
		Scanner sc = new Scanner(System.in);
		String dia = sc.next();
		sc.close();
		//pruebo si se sube bien.
		switch (dia){
		case "1":
		System.out.println("Lunes es un dia laborable");
			break;
		case "2":
		System.out.println("Martes es un dia laborable");
			break;
		case "3": 
		System.out.println("Miércoles es un dia laborable");
			break;
		case "4": 
		System.out.println("Jueves es un dia laborable");
			break;
		case "5": 
		System.out.println("Viernes es un dia laborable");
			break;
		case "6": 
		System.out.println("Sábado es un dia laborable");
			break;
		case "7": 
		System.out.println("Domingo es un dia laborable");
			break;
		default :
			System.out.println ("entre el 1 y el 7"); break;
		}
	}
}

