package padrao.projeto.model;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String mensagem) {
        System.out.println("Log: " + mensagem);
    }
}
