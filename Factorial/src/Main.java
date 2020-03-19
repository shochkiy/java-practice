import AnalogQR.AnalogQRCode;

public class Main {
    public static void main(String[] args) {
        AnalogQRCode QR = new AnalogQRCode(5 );
        QR.createMass();
    }

   /* static int factorial(int n) {
        int result = 1;
        int interResult = 1;
        for (int i = 1; i <= n; i++) {
            interResult *= i;
            result *= interResult;
        }

        return result;
    }*/
}
