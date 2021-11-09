package ejercicios;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        String[] usuario = {"angela", "eduardo", "graciela"};
        String[] clave = {"123", "123", "123"};

        Scanner scanner =  new Scanner(System.in);
        System.out.println( "Cual es tu usuario" );
        String user = scanner.nextLine();
        System.out.println("Cual es la contraseña");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        int cantidadTotal = usuario.length;
        for(int i = 0; i< cantidadTotal; i++){
            if(usuario[i].equalsIgnoreCase(user) && clave[i].equalsIgnoreCase(pass)){
                esAutenticado = true;
                break;
            }
        }
        if(esAutenticado){
            System.out.println("usuario autenticado");
        }else {
            System.out.println("usuario no valido");
        }

    }
}
