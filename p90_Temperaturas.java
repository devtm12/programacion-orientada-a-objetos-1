public class p90_Temperaturas {
    
    public static void PrimerElemento(float[] arreglo) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Primer elemento: " + arreglo[0]);
    }

    public static void TercerElemento(float[] arreglo) {
        System.out.println("Tercer elemento: " + arreglo[2]);
    }

    public static void mostrar(float[] arreglo, String mensaje) {
        System.out.println(mensaje);
        for (float temp : arreglo) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void modificar(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 10) {
                arreglo[i] = 0;
            }
        }
    }

public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        PrimerElemento(temperaturas);
        TercerElemento(temperaturas);
        mostrar(temperaturas, "Elementos del arreglo:");

        modificar(temperaturas);
        mostrar(temperaturas, "Elementos del arreglo después de modificar:");
        mostrar(temperaturas, "Elementos del arreglo nuevamente:");
    }
}