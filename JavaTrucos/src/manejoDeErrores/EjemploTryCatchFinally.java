package manejoDeErrores;

public class EjemploTryCatchFinally {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10/x;
            System.out.println("Después del error " + y);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Siempre se ejecuta");
        }
    }
}
