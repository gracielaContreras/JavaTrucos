# Patrón de diseño

## **¿Qué es un patrón de diseño?**

Un patrón describe un problema que ocurre infinidad de veces en nuestro entorno, así como la solución al mismo, de tal modo que podemos utilizar esta solución un millón de veces más adelante sin tener que volver a pensarla otra vez.

## **¿Para que nos sirve un patrón de diseño?**

Son fundamentales para reutilizar los diseños en el desarrollo orientado a objetos y solucionar un problema común y documentado.

## T**ipos o categorías de patrones de diseño son:**

### **Creacionales**: Resuelven problemas de creación de objetos

1. Singleton La intención del patrón consiste en garantizar que una clase sólo tenga una única instancia y proporcionar un punto de acceso global a ella. El patrón singleton se implementa creando en nuestra clase un método que crea una instancia del objeto sólo si todavía no existe alguna. Para asegurar que la clase no puede ser instanciada nuevamente se regula el alcance del constructor (con visibilidad como protegido o privado).
2. Abstract Factory Permite trabajar con objetos de distintas familias de manera que las familias no se mezclen entre sí y haciendo transparente el tipo de familia concreta que se esté usando

### **Estructurales**: Resuelven problemas de composición de clases

1. Composite La intención del patrón es tratar objetos individuales y objetos compuestos recursivamente en forma uniforme.
    
    Es aplicable cuando los objetos se deben componer en forma recursiva, y no hay distinción (o hay poca) entre objetos compuestos y componentes, y la estructura se puede tratar en forma uniforme.
    
2. Decorator (Envoltorio): Añade funcionalidad a una clase dinámicamente.

### **Comportamiento**: Interacción de objetos

1. Iterator (Iterador): Permite realizar recorridos sobre objetos compuestos independientemente de la implementación de estos.
2. Observer (Observador): Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambie de estado se notifique y actualicen automáticamente todos los objetos que dependen de él.