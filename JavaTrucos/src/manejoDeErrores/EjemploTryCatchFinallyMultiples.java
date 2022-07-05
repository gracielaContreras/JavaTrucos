package manejoDeErrores;

public class EjemploTryCatchFinallyMultiples {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 10/x;
            System.out.println("Valor de la division " + y);
            String nombre = null;
            System.out.println(nombre.toString());

        }catch (ArithmeticException e){
            System.err.printf("Artimethic exception : %s \n", e.getMessage());
        } catch (NullPointerException ex) {
            System.err.printf("NullPointer exception : %s \n", ex.getMessage());
        } catch (Exception ex) { //error genérico
            System.err.printf("Exception : %s \n", ex.getMessage());
        }finally {
            System.out.println("Siempre se ejecuta");
        }
    }
}
