package poo.tareaCarroDeSupermercadoGenerico;

public class ProyectoCarroDeSupermercado {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> carroDeFruta = new BolsaSupermercado<>(5);
        carroDeFruta.addProducto(new Fruta("Manzana", 200.0, 1,"rozo"));
        carroDeFruta.addProducto(new Fruta("Sandia", 1.000, 4, "verde"));
        carroDeFruta.addProducto(new Fruta("Naranja", 800.0, 3, "naranja"));
        carroDeFruta.addProducto(new Fruta("Melon", 1.000, 1, "verde"));
        carroDeFruta.addProducto(new Fruta("Plátano", 900.0, 2, "amarillo"));
        imprimir(carroDeFruta);

        BolsaSupermercado<Lacteo> carroDeLacteo = new BolsaSupermercado<>(5);
        carroDeLacteo.addProducto(new Lacteo("Leche descremada", 1000.0, 2, 200));
        carroDeLacteo.addProducto(new Lacteo("Leche light", 2000.0, 1, 400));
        carroDeLacteo.addProducto(new Lacteo("Yoghurt", 2000.0, 5, 100));
        carroDeLacteo.addProducto(new Lacteo("Sémola", 450.0, 2, 200));
        carroDeLacteo.addProducto(new Lacteo("Yoghurt light", 800.0, 2, 200));
        imprimir(carroDeLacteo);

        BolsaSupermercado<Limpieza> carroDeLimpieza =  new BolsaSupermercado<>(5);
        carroDeLimpieza.addProducto(new Limpieza("Detergente", 5.000, "Detergente liquido", 5));
        carroDeLimpieza.addProducto(new Limpieza("Lavaloza", 2.000, "Lavaloza liquido", 2));
        carroDeLimpieza.addProducto(new Limpieza("Jabón", 1.000, "Jabón liquido", 1));
        carroDeLimpieza.addProducto(new Limpieza("Limpiador de piso", 6.000, "Limpiador de piso liquido", 5));
        carroDeLimpieza.addProducto(new Limpieza("Limpiador de mueble", 4.000, "Limpiador de mueble liquido", 4));
        imprimir(carroDeLimpieza);

        BolsaSupermercado<NoPerecibles> carroDeNoPerecibles = new BolsaSupermercado<>(5);
        carroDeNoPerecibles.addProducto(new NoPerecibles("Jurel", 1.000, 1000, 200));
        carroDeNoPerecibles.addProducto(new NoPerecibles("Atún", 500.0, 500, 500));
        carroDeNoPerecibles.addProducto(new NoPerecibles("Ají", 500.0, 600, 400));
        carroDeNoPerecibles.addProducto(new NoPerecibles("Mayonesa", 3.200, 3000, 100));
        carroDeNoPerecibles.addProducto(new NoPerecibles("Mostaza", 600.0, 600, 200));
        imprimir(carroDeNoPerecibles);

    }

    public static<T> void imprimir (BolsaSupermercado<T> t){
        for( T carro : t ){
                System.out.println( carro );
        }
        System.out.println("===========================================================================");
    }
}
