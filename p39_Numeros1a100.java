public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int c;
        c=1;
        while( c <= 100 ) {
            System.out.print(c+" ");
            c++;
        }
        System.out.println("\nProceso terminado ...");
    }
    }
    
