public class Logger {
    private static Logger instance;
    private String logFile;

    private Logger() {
        this.logFile = "app.log";
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message + " -> " + logFile);
    }
}
