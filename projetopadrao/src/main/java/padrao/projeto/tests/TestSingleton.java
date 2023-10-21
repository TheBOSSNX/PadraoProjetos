package padrao.projeto.tests;

import padrao.projeto.controller.MainControllerSingleton;

public class TestSingleton {
    public static void main(String[] args) {
        MainControllerSingleton controller = new MainControllerSingleton();
        controller.runSingletonExample();
    }
}