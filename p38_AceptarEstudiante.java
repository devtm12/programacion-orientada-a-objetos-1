//Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La
//Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.
import java.util.Scanner;
public class p38_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad, sexo;
        float c1, c2, c3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");

        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();

        System.out.println("Hombre=1 /Mujer=0");
        sexo = obj.nextInt();

        System.out.print("Dame la edad: ");
        edad = obj.nextInt();

        if (sexo == 0) {
            System.out.println("!BIENVENIDA¡");
        } else if (sexo == 1) {
            System.out.println("La universidad Kitty Kat SA es solo para mujeres");
            System.exit(0);
        }

        if (edad >= 21) {
            System.out.println("Eres mayor de edad, continuamos ");
            System.out.println("Dame tres calificaciones separadas por Enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();

            if (c1 >= 8 && c2 >= 8 && c3 >= 8) {
                System.out.printf("\nBIENVENIDO %s eres mujer y tienes %d años, también cuentas con las calificaciones de %.2f,%.2f,%.2f... ACEPTADO\n", nombre, edad, c1, c2, c3);
            } else {
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");
            }
        } else {
            System.out.println("Solo aceptamos estudiantes mayores de edad");
        }

        System.out.println("\nProceso terminado ...");
    }
}
