public class AsciiCharSequence implements CharSequence{

    private byte[] mass;

    public AsciiCharSequence(byte[] mass) {
        this.mass = new byte[mass.length];
        for (int i = 0; i < this.mass.length; i++) {
            this.mass[i] = mass[i];
        }
    }

    @Override
    public int length() {
        return mass.length;
    }

    @Override
    public char charAt(int index) {
        return (char) mass[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subMass = new byte[end - start];
        for (int i = 0; i < subMass.length; i++) {
            subMass[i] = mass[i+start];
        }
        return new AsciiCharSequence(subMass);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < mass.length; i++) {
            res.append((char) mass[i]);
        }
        return res.toString();
    }
}
