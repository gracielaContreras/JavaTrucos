package collecciones;

class BeanGenerico<T>{
    private T valor;

    public BeanGenerico(T valor) {
        this.valor = valor;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
}

public class EjemploGenericos {
    public static void main(String[] args) {
        BeanGenerico<String> bean = new BeanGenerico<>("Alex");
        System.out.println(bean.getValor());
        bean.setValor("Pepe");
        System.out.println(bean.getValor());
    }
}
