package manejoDeErrores;

public class EjemploUnionCatchBlocks {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 10/x;
            System.out.println("Valor de la division " + y);
            String nombre = null;
            System.out.println(nombre.toString());

        }catch (ArithmeticException | NullPointerException e){ //union de catch
            System.err.printf("Artimethic y NullPointer exception : %s \n", e.getMessage());
        } catch (Exception ex) { //error genérico
            System.err.printf("Exception : %s \n", ex.getMessage());
        }finally {
            System.out.println("Siempre se ejecuta");
        }
    }
}
