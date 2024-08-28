import java.util.Scanner;
    
    public class p34_NumeroMayor {
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
                int num1,num2,num3;
                System.out.println("Verfica que numero es mayor\n");
                System.out.print("Dame un numero entero ? ");
                num1 = new Scanner(System.in).nextInt();
                System.out.print("Dame un numero entero ? ");
                num2 = new Scanner(System.in).nextInt();
                System.out.print("Dame un numero entero ? ");
                num3 = new Scanner(System.in).nextInt();
                
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("El mayor es: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        
        }}