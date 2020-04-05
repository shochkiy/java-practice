import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int next;
        if (prev != -1) {
            while (prev != -1 ) {
                next = System.in.read();
                if ((prev != 13) || (next != 10)) {
                    System.out.println(prev);
                }
                prev=next;
            }
        }
        System.out.flush();
    }
}
