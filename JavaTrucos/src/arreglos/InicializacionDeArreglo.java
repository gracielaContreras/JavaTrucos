package arreglos;

public class InicializacionDeArreglo {

    static void imprimirArreglo(String arreglo[]){
        for (String valor: arreglo) {
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        //declaración Explícita
        String nombres[] = new String[2];
        nombres[0] = "raidentrance";
        nombres[1] = "devs4j";
        imprimirArreglo(nombres);
        //declaración Implícita
        String nombres2[] = {"raidentrance","devs4j"};
        imprimirArreglo(nombres2);
        //declaración anónima
        String nombres3[] = new String[] {"raidentrance","devs4j"};
        imprimirArreglo(new String[] {"raidentrance","devs4j"});

    }
}


