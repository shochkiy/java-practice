import java.util.logging.*;

public class Main {

    public static void main(String[] args) {

    }



    private static void configureLogging() {
        Logger A = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger B = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger C = Logger.getLogger("org.stepic.java");

        A.setLevel(Level.ALL);
        B.setLevel(Level.WARNING);
        C.setLevel(Level.ALL);

        C.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);

        C.addHandler(handler);
        XMLFormatter xmlFormatter = new XMLFormatter();
        handler.setFormatter(xmlFormatter);


    }


    
    
}


