import java.util.Scanner;

public class TestMatematicas
{
    public static void main(String [] arg)
    {
        System.out.println("Escribe un numero");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
       //System.out.printf("El número dado es: %d ", numero);
       boolean par = Matematicas.esPar(numero);
       System.out.printf("¿El número dado %d es par? %b%n",numero, par);
       boolean multiploDeTres = DivisiblePorTres.esDivisiblePorTres(numero);
       System.out.printf("¿El número dado %d es multiploDeCinco? %b%n",numero, multiploDeTres);
       boolean multiploDeCinco = DivisiblePorCinco.esDivisiblePorCinco(numero);
       System.out.printf("¿El número dado %d es multiploDeCinco? %b",numero, multiploDeCinco);       
    }
}