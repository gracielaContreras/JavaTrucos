package patrones_de_diseno.singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton getInstance;

    private ConexionDBSingleton() {
        System.out.println("Conectando a la base de datos");
    }

    public static ConexionDBSingleton getInstance() {
        if(getInstance == null){
            getInstance = new ConexionDBSingleton();
        }
        return getInstance;
    }
}
