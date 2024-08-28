import java.util.Scanner;

    public class  p37_CalculoNotasP{
        
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
            System.out.flush();
        Scanner scanner = new Scanner(System.in);
        float  num1,num2,num3,num4,num5;
        float promedio;

        System.out.println("Introduce 5 calificaciones:");
        System.out.print("primera ");
                num1 = new Scanner(System.in).nextInt();
                System.out.print("segunda ");
                num2 = new Scanner(System.in).nextInt();
                System.out.print("tersera ");
                num3 = new Scanner(System.in).nextInt();
                System.out.print("cuatra ");
                num4 = new Scanner(System.in).nextInt();
                System.out.print("quinta ");
                num5 = new Scanner(System.in).nextInt();
       
        promedio = (num1+num2+num3+num4+num5)/5;

        System.out.println("Promedio: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pues mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así");
        }
    }
}

