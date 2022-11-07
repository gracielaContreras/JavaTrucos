package patrones_de_diseno.composite;

public class Main {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        System.out.println(doc.mostrar(0));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado patron-composite.docx : " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado Api Stream : " + encontrado);

        encontrado = doc.buscar("cv.docsx");
        System.out.println("Encontrado cv.docx : " + encontrado);
    }
}
