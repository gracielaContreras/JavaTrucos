package optimizacion;

public class UsoDeWrappers {

    private static long[] numeros = new long[10_000_000];

    public static void main(String[] args) throws InterruptedException {

        long antes = System.currentTimeMillis();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (long) i;
        }

        long ahora = System.currentTimeMillis();

        System.out.println("tiempo que ha trascurrido: " + (ahora-antes));

    }
}
