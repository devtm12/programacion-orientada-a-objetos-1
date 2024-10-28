import java.io.File;
import java.util.Scanner;
public class p126_Excepcion6 {
public static void main(String[] args) {
File nombres = new File("nombres.txt"); 
System.out.print("\033[H\033[2J");
try {
   
   
Scanner obj = new Scanner(nombres);
while (obj.hasNextLine())
System.out.println(obj.nextLine());
} catch (Exception e) {

System.out.println("Problemas al procesar el archivo ..");

}
}
}