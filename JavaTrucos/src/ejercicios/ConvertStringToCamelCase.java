package ejercicios;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {

//        String s = "the-stealth-warrior";
        String s = "the_stealth_warrior";
        String first ="";
        String[] parts;
        String camelCaseString = "";

        if(s.length() >0) {

            parts = s.split("[-_]");
            first = parts[0];
            for (int i = 1; i < parts.length; i++) {
                camelCaseString = camelCaseString + toProperCase(parts[i]);
            }
            s = first+camelCaseString;
        }
        System.out.println(s);

    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
