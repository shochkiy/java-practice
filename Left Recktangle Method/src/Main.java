import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 1e-7;
        double res = 0;
        while (a < b) {
            res += (f.applyAsDouble(a) * n);
            a+=n;
        }
        return res;
    }
}
