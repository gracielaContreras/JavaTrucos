package expresionesLambda.tarea.numero1;

/**
 * Expresión Lambda que elimine espacios, comas y puntos de una frase y
 * además la devuelva la frase convertida en mayúscula.
 *
 * Preguntas de esta tarea
 * Publica acá tu código fuente completo de la interface funcional y la clase main con la expresión lambda.
 */

public class MainQueElimineEspacios {
    public static void main(String[] args) {
        Conversion conversion = a -> a.replace(" ", "").replace(",", "")
                            .replace(".", "").toUpperCase();

        ConversionFrase conv = new ConversionFrase();

        System.out.println(conv.conversionFrase("Expresión Lambda que elimine espacios, comas y puntos de una frase " +
                "y además la devuelva la frase convertida en mayúscula.",conversion));
        System.out.println(conv.conversionFrase("Hola mundo.", conversion));

    }
}
