package poo.genericsclass.sinGenerico;

public class EjemploSinGenericos {
    public static void main(String[] args) {

        Camion transporteAnimal = new Camion(3);
        transporteAnimal.add(new Animal("Jack", "Perro"));
        transporteAnimal.add(new Animal("tomy", "Gato"));
        transporteAnimal.add(new Animal("terry", "Perro"));

        for( Object o : transporteAnimal ){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }
        System.out.println("------------------------------------");
        Camion transporteMaquinaria = new Camion(3);
        transporteMaquinaria.add(new Maquinaria("Bulldozer"));
        transporteMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        for( Object o : transporteMaquinaria ){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }
        System.out.println("------------------------------------");
        Camion transporteAutomovil = new Camion(3);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Nissan"));
        transporteAutomovil.add(new Automovil("Honda"));

        for( Object o : transporteAutomovil ){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }
}
