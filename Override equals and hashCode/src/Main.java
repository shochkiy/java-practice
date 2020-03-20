public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



        ComplexNumber a1 = new ComplexNumber(1123,213);
        ComplexNumber b1 = new ComplexNumber(1178,1123);
        System.out.println(a1.equals(b1));
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
    }
}
