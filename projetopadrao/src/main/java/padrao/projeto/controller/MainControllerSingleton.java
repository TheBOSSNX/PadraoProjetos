package padrao.projeto.controller;

import padrao.projeto.model.Logger;

public class MainControllerSingleton {
    public void runSingletonExample() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Instâncias são iguais: " + (logger1 == logger2));

        logger1.log("Mensagem de Log");
        logger2.log("Outra Mensagem de Log");
    }
}
