package p94_Empleado01;

public class App {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 35;
        System.out.println(empleado1.toString());
    
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Maria de Jesus";
        empleado2.Edad = 16;

        System.out.println(empleado2.toString());
   
        System.out.println("Nombre : " + empleado1.Nombre);
        System.out.println("Edad : " + empleado1.Edad);
    }
}
