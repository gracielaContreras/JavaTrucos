package manejoDeErrores;

public class EjemploThowCheck {

    /**
     * Manejar excepciones será una de dos cosas
     *  - Atrapar la excepción try catch
     *  - o Propagar a quien invocó el método
     * @throws Exception
     */

    static double dividir(int a, int b) throws Exception {
        if(b!=0){
            return a/b;
        } else {
            throw new Exception("No se puede dividir entre 0");
        }
    }
    public static void main(String[] args) throws Exception {  //Propagar a quien invocó el método (throws Exception)
        double resultado =  dividir(10,0);
        System.out.println("Resultado : "+ resultado);
    }
/*    public static void main(String[] args)  {
        double resultado;
        try {
            resultado = dividir(10,0);
            System.out.println("Resultado : "+ resultado);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());  //Atrapar la excepción try catch
        }
    }*/
}
