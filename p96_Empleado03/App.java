import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan Perez",35,'H',true));
        empleados.add(new Empleado("Maria de Jesus",16,'M',false));
        empleados.add(new Empleado("Dario Jimenez",33,'H',true));
        empleados.add(new Empleado("Jessica Jimenez",45,'H',true));
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nLos empleados en el ArrayList");

        for (Empleado empleado : empleados)

        System.out.println(empleado.toString());
        System.out.println("\nEl primer elemento del ArrayList");
        System.out.println(empleados.get(0));
        System.out.println("\nRealizando calculos:");
        int suma=0, th=0, tm=0, tc=0, tnc=0;

        for(int i=0; i < empleados.size(); i++) {
            suma = suma + empleados.get(i).getEdad();
            if(empleados.get(i).getSexo()=='H') th++; else tm++;
            if(empleados.get(i).getCasado()) tc++; else tnc++;
        }
        System.out.println("Promedio de edades: " + (suma/empleados.size()));
        System.out.println("Hombres : " + th);
        System.out.println("Mujeres : " + tm);
        System.out.println("Casados : " + tc);
        System.out.println("No Casado : " + tnc);
    }
}