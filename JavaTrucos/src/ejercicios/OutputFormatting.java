package ejercicios;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String padded = String.format("%-15s", s1);
            if ((String.valueOf(x).length() == 2)) {
                System.out.println(padded +"0" + x);
            } else {
                if ((String.valueOf(x).length() == 1)) {
                    System.out.println(padded + "00" + x);
                } else {
                    System.out.println(padded + x);
                }
            }
        }
        System.out.println("================================");
    }
}
