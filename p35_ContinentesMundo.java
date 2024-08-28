
import java.util.Scanner;
 public class p35_ContinentesMundo {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero entre 1 y 6 imprime el continente \n");
        System.out.print("Dame el número? ");
            int mes = new Scanner(System.in).nextInt();
            switch (mes) {
               case 1 : System.out.println("ASIA");break;
               case 2 : System.out.println("AFRICA");break;
               case 3 : System.out.println("AMERICA DEL NORTE");break; 
               case 4 : System.out.println("AMERICA DEL SUR");break;
               case 5 : System.out.println("ANTARTIDA ");break;
               case 6 : System.out.println("EUROPA");break;
            
               
                  default : System.out.println("ERROR ");break;
}
                    System.out.println("\n\nGracias por utilizar el programa java");
}
}