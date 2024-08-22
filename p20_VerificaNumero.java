import java.util.Scanner;

   public class p20_VerificaNumero {

    public static void main(String[] args) {
int n;
System.out.println("Verfica si un número es postivo, negativo o cero\n");
System.out.print("Dame un numero entero ? ");
n = new Scanner(System.in).nextInt();



if( n<0 ) System.out.println("El número " +n+ " es NEGATIVO");
if( n==0 ) System.out.println("El número " +n+ " es CERO");
if( n>0 )System.out.println("El número es POSITIVO");
System.out.println("\nGracias por utilizar este programa\n");
}
}