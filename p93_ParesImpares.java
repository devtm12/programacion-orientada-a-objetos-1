public class p93_ParesImpares {

    public static int[] generarNumerosAleatorios(int n) {
                int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }
        return numeros;
    }

    public static void mostrarNumeros(int[] numeros) {
        System.out.println("Números:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mostrarPares(int[] numeros) {
        System.out.println("Pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void mostrarImpares(int[] numeros) {
        System.out.println("Impares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void mostrarConteoParesImpares(int[] numeros) {
        int conteoPares = 0, conteoImpares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                conteoPares++;
            } else {
                conteoImpares++;
            }
        }
        System.out.println("Conteo pares: " + conteoPares);
        System.out.println("Conteo impares: " + conteoImpares);
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int[] numeros = generarNumerosAleatorios(100);

        mostrarNumeros(numeros);
        mostrarPares(numeros);
        mostrarImpares(numeros);
        mostrarConteoParesImpares(numeros);
    }

}
