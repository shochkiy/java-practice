import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
