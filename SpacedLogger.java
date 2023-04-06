public class SpacedLogger implements Logger {
    @Override
    public void question1PartA(String Log) {
        String logs = "";
        for ( int i = 0; i < Log.length(); i++) {
            logs = logs + Log.charAt(i) + " ";
        }
        System.out.println(logs);
    }

    @Override
    public void question1PartB(String Error) {
        String errs = "";
        for ( int i = 0; i < Error.length(); i++) {
            errs = errs + Error.charAt(i) + " ";
        }
        System.out.println("ERROR: " + errs);
    }
}
