public class Application {
    public static void main (String[] args){
        AsteriskLogger asteriskLogger1 = new AsteriskLogger();
        asteriskLogger1.question1PartA("Hello");

        AsteriskLogger asteriskLogger2 = new AsteriskLogger();
        asteriskLogger2.question1PartB("***Error: Hello***");

        SpacedLogger spacedLogger1 = new SpacedLogger();
        spacedLogger1.question1PartA("Hello");

        SpacedLogger spacedLogger2 = new SpacedLogger();
        spacedLogger1.question1PartB("Hello");
    }
}
