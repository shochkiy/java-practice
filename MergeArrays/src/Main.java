import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = { 1, 12, 18, 9, 3, 5, 2};
        int[] a2 = { 0, 36, 45, 4};
        int[] a3 = mergeArrays(a1,a2);
        for (int i = 0; i < a3.length; i++){
            System.out.println(a3[i]);
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int[] result = new int[a1.length+a2.length];
        for (int i = 0, j = 0, k = 0; i < result.length; i++) {
            if (j > a1.length-1) {
                result[i] = a2[k];
                k++;
            } else if (k > a2.length-1) {
                result[i] = a1[j];
                j++;
            } else if (a1[j] < a2[k]) {
                result[i] = a1[j];
                j++;
            } else {
                result[i] = a2[k];
                k++;
            }
        }
        return result ; // your implementation here
    }
}
