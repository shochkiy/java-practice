
import java.util.Scanner; // импорт сканера

public class Main {
    public static void main(String args[]){
        double summ = 0;
        double el;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            el = 0;
            try {
               el = Double.parseDouble(scan.next());
            } catch (NumberFormatException e) {

            } finally {
                summ += el;
            }
        }
        System.out.printf("%.6f", summ);
    }
}
