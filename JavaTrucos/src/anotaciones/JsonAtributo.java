package anotaciones;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD) //tipo campo
@Retention(RetentionPolicy.RUNTIME) //va a ejecutarse en tiempo de ejecución
public @interface JsonAtributo {
     String nombre() default "";
     boolean capitalizar() default false;
}
