package ejercicios;

import java.util.Scanner;

public class NumerosPrimitivoCapacidad {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1)System.out.println("* int");
                if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63)-1)System.out.println("* long");
/*
                También se puede usar lo siguiente:
                    Short.MIN_VALUE
                    Short.MAX_VALUE
                    Integer.MIN_VALUE
                    Integer.MAX_VALUE
                    Long.MIN_VALUE
                    Long.MAX_VALUE
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
*/
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
