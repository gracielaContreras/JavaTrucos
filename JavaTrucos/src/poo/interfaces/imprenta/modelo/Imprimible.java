package poo.interfaces.imprenta.modelo;

public interface Imprimible {

    String TEXTO_DEFECTO =  "Imprimiendo un valor por defecto";

    default String imprimir(){
      return TEXTO_DEFECTO;
    };

    //Método de imprimir - contrato de implementación de la clase abstracta Hoja
    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
