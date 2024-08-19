//calcular el area de un triangulo
import java.util.Scanner;
public class p2_AreaDelTriangulo {
    public static void main(String[] args) {
        int base,altura;
        double area;
        Scanner obj= new Scanner(System.in);

        System.out.print"Dame la base ?");
        base = obj.nextInt();
        System.out.print("Dame la altura ?");
        altura = obj.nextInt();
        area = base *altura/2;

        System.out.println(String.format("El triangulo debase %d y altura %d tiene una area de %.2f",base,altura,area));
    }
}
