import java.util.Scanner;

public class p76_NumeroMenor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuatro números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println("El número menor es: " + numeroMenor(num1, num2, num3, num4));
    }

    public static int numeroMenor(int num1, int num2, int num3, int num4) {
    
        int menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        return menor;
    }
}

