// pasar como arreglo a una funcion


public class p86_ArregloMostrar {
   public static void Mostrar (int[] x) {
    for (int i=0; i<x . length; i++)
       System.out.print(x[i]+"");
    System.out.println(null);
    
   }
   public static void cuadrado (int[] x){
    for (int i=0; i < x. length;i ++ )
    x[i]=x[i] *x[i];
   }

   public static void main(String[] args) {
    
    int[] A = {2,4,6,8,10,12};
    int[] B = {1,3,5,7,9,11};
    System.out.print("\033[H\033[2J");System.out.flush();
    System.out.println("Areglo A");
    Mostrar (A);
    System.out.println("Areglo B");
    cuadrado(B);
   }
}
