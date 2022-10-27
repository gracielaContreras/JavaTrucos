package recursividad;

import recursividad.models.Componente;
import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("CPU AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco duro 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu)
                    .addComponente(tv)
                    .addComponente(ram)
                    .addComponente(ssd);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

//        metodoRecursivo(pc, 0);
        metodoRecursivoStream(pc, 0).forEach(componente ->
            System.out.println("\t".repeat(componente.getNivel()) + componente.getNombre()));
    }

    public static Stream<Componente> metodoRecursivoStream(Componente componente, int nivel){
        componente.setNivel(nivel);
        return Stream.concat(Stream.of(componente),
                            componente.getHijos().stream().flatMap(hijo -> metodoRecursivoStream(hijo,nivel + 1)));
    }

    public static void metodoRecursivo(Componente componente, int nivel){
        System.out.println("\t".repeat(nivel) + componente.getNombre());
        if(componente.tieneHijos()){
            for (Componente hijo :componente.getHijos()) {
                metodoRecursivo( hijo, nivel +1);
            }
        }
    }
}
