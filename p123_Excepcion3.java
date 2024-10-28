 import java.util.InputMismatchException;
import java.util.Scanner;
public class p123_Excepcion3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        try {
            System.out.print("Valor del numerador : "); int a = obj.nextInt();
            System.out.print("Valor del denominador : "); int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es " + c);
        } catch (ArithmeticException e) {

        
            System.out.println("El denominador no puede ser 0");

        } catch (InputMismatchException e) {

            System.out.println("Numerador y Denominador deben ser números enteros");

        }
    }
}

