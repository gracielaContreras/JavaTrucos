package threads.tarea;

/**        Para la tarea se pide implementar una clase llamada AlfanumericoTarea
        que implemente la interface Runnable y tenga como atributo un enum llamado Tipo.

        El enum Tipo tiene dos elementos NUMERO Y LETRA.

        Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.

        Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.

        Crea un par de hilos de diferentes tipos y ejecutarlos.
 */

public class TareaHilo {
    public static void main(String[] args) {

        new Thread(new AlfanumericoTarea(Tipo.NUMERO)).start();
        new Thread(new AlfanumericoTarea(Tipo.LETRA)).start();
    }
}
