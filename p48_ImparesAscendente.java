import java.util.Scanner;
public class p48_ImparesAscendente {
    public static void main(String[] args) {
    int n, c, s, cont;
    double prom;
    char resp;
    Scanner obj = new Scanner(System.in);
    do {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Imprime números impares ascendente\n");
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();
        s = 0;
        cont = 0;
        c = 1;
        System.out.print("Números impares entre 1 y " + n + ": ");
        while (c <= n) {
            if (c % 2 != 0) {
                System.out.print(c + " ");
                s += c;
                cont++;
            }
            c++;
        }
        System.out.println();
        prom = (double) s / cont;
        System.out.println("La suma es: " + s);
        System.out.println("El promedio es: " + prom);
        System.out.print("\nDeseas continuar (S/N) ? ");
        resp = Character.toUpperCase(obj.next().charAt(0));
    } while (resp != 'N');
    System.out.println("\nGracias por utilizar este programa !");
}
}