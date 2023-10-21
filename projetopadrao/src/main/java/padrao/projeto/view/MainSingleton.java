package padrao.projeto.view;

import padrao.projeto.controller.MainControllerSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        MainControllerSingleton controller = new MainControllerSingleton();
        controller.runSingletonExample();
    }
}
