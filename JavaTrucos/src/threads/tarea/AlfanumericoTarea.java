package threads.tarea;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable {

    private Tipo tipo;
    private String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
                if( tipo == Tipo.NUMERO ){
                    for ( int i = 0; i <= 10; i++ ) {
                        System.out.print( "numero: " + i +"\t" );
                        TimeUnit.SECONDS.sleep(1);

                    }
                    System.out.println();
                }
                if( tipo.equals(Tipo.LETRA )){
                    for (String c : alfabeto) {
                        System.out.print( "Letra: " + c +"\t" );
                        TimeUnit.SECONDS.sleep(1);
                    }

                    System.out.println();
                }
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
    }
}
