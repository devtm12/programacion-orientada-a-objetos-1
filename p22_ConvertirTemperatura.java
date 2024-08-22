import java.util.Scanner;

public class p22_ConvertirTemperatura {
    public static void main(String[] args) {
        float temp, res;
        int op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");
        System.out.println(" [1] Farenheit a Centigrados");
        System.out.println(" [2] Centigrados a Farenheit");
        System.out.println("Elije una opcion? "); op = obj.nextInt();

        if (op == 1){
            System.out.println("Convertimos de Farenheit a Centigrados");
            System.out.println("Dame la temperatura en Farenheit ? "); temp = obj.nextFloat();
            res = (temp - 32) * 5f / 9f;
            System.out.printf("%.2f Farenheit equivale a %.2f Centigrados", temp, res);
        }
        else if (op == 2){
            System.out.println("Convertimos de Centigrados a Farenheit");
            System.out.println("Damee la temperatura en Farenheit ? "); temp = obj.nextFloat();
            res = (temp * 9f / 5f) + 32;
            System.out.printf("%.2f Centigrados equivale a %.2f Farenheit", temp, res);
        }
        else
            System.out.println("\nElegite una opcion invalida...");

        System.out.println(" \n Gracias por utilizar este programa");
    }
}