package padrao.projeto.controller;

import padrao.projeto.model.PayPalPayment;
import padrao.projeto.model.ShoppingCart;
import padrao.projeto.model.CreditCardPayment;

public class MainControllerStrategy {
    public void runStrategyExample() {
        ShoppingCart cart = new ShoppingCart();

        // Pagamento com cartão de crédito
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // Pagamento com PayPal
        PayPalPayment payPalPayment = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}