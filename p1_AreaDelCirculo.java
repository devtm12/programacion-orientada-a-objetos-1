import java.util.Scanner;

public class p1_AreaDelCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio =new Scanner(System.in);
        System.out.println("\n Calculandoel area del ciculo\n");
        System.out.println("Dame el radio ?");
           radio= lradio.nextFloat();

           area = Math.PI * Math.pow(radio, 2);

         System.out.println("El circulo de radio  "+ radio + "  tiene una area de "+ area);
    }
}
