import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(7);
        System.out.println(sum(lst));

        int i = 2;
        int j = 3;
        System.out.println("i++ = " + i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("j++ = " + j++);



    }

    static int sum (List<Integer> list) {
        int sum = 0;
        for (Integer i : list ) {
            sum += ++i;
        }
        return sum;
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text)!=Label.OK) {
                return analyzer.processText(text);
            }
    }
        return Label.OK;
    }
}
