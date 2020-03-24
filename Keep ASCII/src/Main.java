public class Main {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence ascii = new AsciiCharSequence(example);
        System.out.println(ascii);
        System.out.println(ascii.length());
        System.out.println(ascii.charAt(1));
        System.out.println(ascii.subSequence(1,5));
     }
}
