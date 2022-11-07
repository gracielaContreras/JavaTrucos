package patrones_de_diseno.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexionDBSingleton con = null;
        for(int i=0; i< 10; i++){
            con = ConexionDBSingleton.getInstance();
            System.out.println("conexión = " + con);
        }
        
        ConexionDBSingleton con2 = ConexionDBSingleton.getInstance();
        ConexionDBSingleton con3 = ConexionDBSingleton.getInstance();
        boolean es = ((con == con2) && (con2 == con3) && (con3 == con));
        System.out.println("La conexión utiliza la misma instancia = " + es);
    }




}
