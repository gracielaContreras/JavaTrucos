package clasesInternas;

class ExternalStatic { //clase externa
    void food(){
        System.out.println("Food");
    }
    static class InternalStatic { //clase interna static
        void bar(){
            System.out.println("Bar");
        }
    }
}
public class ClasesInternasStatic {
    public static void main(String[] args) {
        ExternalStatic.InternalStatic internal = new ExternalStatic.InternalStatic();
        internal.bar();
    }
}
