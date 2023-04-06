public class AsteriskLogger implements Logger{
    @Override
    public void question1PartA(String Log) {
        System.out.println("***" + Log + "***");
    }

    @Override
    public void question1PartB(String Error) {
        String err = "";
        for ( int i = 0; i < Error.length(); i++){
            err = err + "*";
        }
        System.out.println(err);
        System.out.println(Error);
        System.out.println(err);
    }
}
