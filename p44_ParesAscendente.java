import java.util.Scanner;
public class p44_ParesAscendente {
    public static void main(String[] args) {
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Imprime números pares ascendente\n");
            System.out.print("Hasta donde ? "); n = obj.nextInt();
            s=0;c=2;
            while( c<=n ) {
                System.out.printf("%d ",c);
                s = s + c;
                c = c+2;
}
           System.out.printf("\nLa suma es %d",s);

           System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
} 
           while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
}
}