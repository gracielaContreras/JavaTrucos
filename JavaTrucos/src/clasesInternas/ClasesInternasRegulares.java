package clasesInternas;

class External {
    void food(){
        System.out.println("Food");
    }
    class Internal {
        void bar(){
            System.out.println("Bar");
        }
    }
}
public class ClasesInternasRegulares {
    public static void main(String[] args) {
        External ex = new External();
        ex.food();
        External.Internal internal = ex.new Internal();
        internal.bar();
    }
}
