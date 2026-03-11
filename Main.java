public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("inicio");
        logger2.log("inicio 2.0 abc");

        System.out.println(logger1 == logger2);
    }
}
