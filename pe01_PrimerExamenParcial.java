//Devani Caroloina Trejo Martinez
//elaborar un programa que solicite el nombre, la edad, sexo y si es alumno,docente o trabajador, solisitar un costo,
// para poder entrar a un curso dependiendo tomando en cuenta que debe de tener almenoss 23 años para poder asistir. 
import java.util.Scanner;
public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        
        int alumnos = 0;
        int docentes = 0;
        int trabajadores = 0;
        int hombres = 0;
        int mujeres = 0;
        int participantes = 0;
        int rechazados = 0;
        double promedioEdad = 0;
        double totalDineroAlumnos = 0;
        double totalDineroDocentes = 0;
        double totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;
//ENTRADA
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
           int edad= scanner.nextInt();
            scanner.nextLine();
//PROCESO
            if (edad < 23) {
                System.out.println("Lo siento, no puedes asistir al curso.");
                rechazados++;
                continue;
            }
          
            System.out.print("Sexo (H/M): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Tipo de Participante (Alumno, Docente, Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            System.out.println("Bienvenido " + nombre + "!");

            switch (tipoParticipante) {
                case "Alumno":
                    alumnos++;
                    totalDineroAlumnos += 40;
                    break;
                   case  "alumno":
                    alumnos++;
                    totalDineroAlumnos += 40;
                    break;
                case "Docente":
                    docentes++;
                    totalDineroDocentes += 60;
                    break;
                    case "docente":
                    docentes++;
                    totalDineroDocentes += 60;
                    break;
                case "Trabajador":
                    trabajadores++;
                    totalDineroTrabajadores += 80;
                    break;
                case "trabajador":
                    trabajadores++;
                    totalDineroTrabajadores += 80;
                    break;
            }

            if (sexo == 'H') {
                hombres++;
            } else {
                mujeres++;
            }

            participantes++;
            promedioEdad += edad;

            System.out.print("¿Desea inscribir otro participante? (S/N): ");
            char respuesta = scanner.next().charAt(0);
            scanner.nextLine();
             if (respuesta == 'N' || respuesta == 'n') {
                break;
            }
        }

        promedioEdad /= participantes;
//SALIDA
        System.out.println("________________________________________");
        System.out.println("|Total, de Alumnos: " + alumnos);
        System.out.println("|Total, de Docentes: " + docentes);
        System.out.println("|Total, de Trabajadores: " + trabajadores);
        System.out.println("|Total, de Hombres: " + hombres);
        System.out.println("|Total, de Mujeres: " + mujeres);
        System.out.println("|Total, de Participantes: " + participantes);
        System.out.println("|Promedio de la edad de todos los participantes: " + promedioEdad);
        System.out.println("|Total, de Rechazados: " + rechazados);
        System.out.println("|__________________________________________\n\n");


        System.out.println("Total, Dinero Alumnos: " + totalDineroAlumnos);
        System.out.println("Total, Dinero Docentes: " + totalDineroDocentes);
        System.out.println("Total, Dinero Trabajadores: " + totalDineroTrabajadores);
        System.out.println("____________________________________________\n");
        System.out.println("Total, Dinero General: " + (totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores));
        System.out.println("_____________________________________________\n");
       
        if (totalDineroGeneral < 50) {
            System.out.println("  EL EVENTO CONCLUYE EN GANANCIAS BAJAS.");

        } else if (totalDineroGeneral >= 50 && totalDineroGeneral < 1000) {
            System.out.println("EL EVENTO CONCLUYE EN GANANCIAS MODERADAS.");

        } else {
            System.out.println("EL EVENTO CONCLUYE EN BUENAS GANANCIAS .");
        }
    }
}

