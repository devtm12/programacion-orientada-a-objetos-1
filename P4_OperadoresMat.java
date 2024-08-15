public class P4_OperadoresMat {
    public static void main(String[] args) {
        double x,y,suma,resta,mult,div,res,pot;
        x =10.5;
        y=2.5;
        suma= x+y;
        resta= x-y;
        mult= x*y;
        div=x/y;
        res=x%y;
        pot= Math.pow(x,y)

        System.out.println(String.format("Los numeros son %.2f",x,y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta:\n%.2f",suma,resta));
        System.out.println(String.format("Multiplicacion: %.2f\nDivicion: %.2f",mult,div));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f",res,pot));
    }
}
