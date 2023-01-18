package apiStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploWebScraping {
    public static void main(String[] args) {
//    String textoEjemplo = "Hola <b>Mundo</b>, soy <b>Graciela</b>. Bienvenido a <b>Mundo</b>";
//    List<String> tags = getBoldTags(textoEjemplo);
//    long total = tags.stream()
//            .filter(tag -> tag.equalsIgnoreCase("Mundo"))
//            .count();
//    System.out.println("Total: " + total);

        String contenidoHtml = getWebConten("https://www.bbc.com");
        List<String> tags = getTags(contenidoHtml,"h3");

//        tags.stream().forEach(System.out::println);

//        tags.stream().map(tag -> {
//          return "<strong>"+tag+"</strong>";
//        }).skip(1).forEach(System.out::println);
    }

    private static String getWebConten(String link){

        StringBuffer resultado = new StringBuffer();
        try {
            URL url = new URL(link);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String linea;
            while ((linea = reader.readLine()) != null){
                resultado.append(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado.toString();
    }
    public static List<String> getBoldTags(String texto){
    List<String> tags = new ArrayList<>();
    String expresionRegular ="<b>(\\S+)</b>";
    Pattern pattern = Pattern.compile(expresionRegular);

    Matcher resultado = pattern.matcher(texto);

    while(resultado.find()){
        String aux = resultado.group();
        aux = aux.substring(3, aux.length() - 4);
        tags.add(aux);
    }
    return tags;
    }

    private static List<String> getTags(String texto, String tipoDeTag){
        List <String> tags = new ArrayList<>();
        String regexp = "<"+tipoDeTag+">([^<>]*)</"+tipoDeTag+">";
        Pattern pattern = Pattern.compile(regexp);

        Matcher resultado = pattern.matcher(texto);

        while(resultado.find()){
            String aux = resultado.group();
            Integer size = tipoDeTag.length()+2;
            aux = aux.substring(size,aux.length() - size - 1);
            tags.add(aux);
        }

        return tags;
    }
}
