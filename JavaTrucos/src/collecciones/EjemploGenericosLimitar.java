package collecciones;

class Transporte{}
class Coche extends Transporte{}
class Deportivo extends Coche{}

class BeanGenericoLimitar<T extends Transporte>{
    private T valor;

    public BeanGenericoLimitar(T valor) {
        this.valor = valor;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
}

public class EjemploGenericosLimitar {
    public static void main(String[] args) {
        BeanGenericoLimitar<Transporte> beanTransporte = new BeanGenericoLimitar<>(new Transporte());
        BeanGenericoLimitar<Coche> beanCoche = new BeanGenericoLimitar<>(new Coche());
        BeanGenericoLimitar<Deportivo> beanDeportivo = new BeanGenericoLimitar<>(new Deportivo());
    }
}
