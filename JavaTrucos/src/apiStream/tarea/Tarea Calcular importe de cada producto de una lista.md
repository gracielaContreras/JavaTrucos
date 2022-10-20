# Tarea: Calcular importe de cada producto de una lista y sumarlo

Calcular importe de cada producto y el gran total

El siguiente requerimiento es para una lista de productos `List<Producto>` , de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando stream convertir la lista de productos en el gran total del tipo double.

Resultado Docente

Clase Producto:

```java
    public class Producto {

        private double precio;
        private double cantidad;

        public Producto(double precio, double cantidad) {
            this.cantidad = cantidad;
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        public double getCantidad() {
            return cantidad;
        }
    }
```

Forma 1:

```java
        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));
        double sum = facturas.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);
```

Forma 2:

```java
        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));

        double sum = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio())
                .sum();

        System.out.println(sum);
```