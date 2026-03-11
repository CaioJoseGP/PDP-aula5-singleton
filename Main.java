public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("testes sla aslalsmdadmsaldsa");
        
        Logger logger2 = Logger.getInstance();
        logger2.log("esse eh o 2 vamo ve se trava hehehehe");
        
        System.out.println("São iguais? " + (logger1 == logger2));
    }
}
