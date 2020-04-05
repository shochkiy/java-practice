import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {

    InputStream stream = new ByteArrayInputStream( new byte[] { 0x33, 0x45, 0x01});
    System.out.println(checkSumOfStream(stream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        for(int i = inputStream.read(); i != -1; i = inputStream.read()) {
            result = Integer.rotateLeft(result,1) ^ i;
        }
        return result;
    }
    }
