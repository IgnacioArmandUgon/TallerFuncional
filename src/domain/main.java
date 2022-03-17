package domain;



public class main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        System.out.println(op.sumar.apply(2,2));
        System.out.println(op.restar.apply(2,1));
        System.out.println(op.multiplicar.apply(2,2));
        System.out.println(op.dividir.apply(6, 2));
    }
}
