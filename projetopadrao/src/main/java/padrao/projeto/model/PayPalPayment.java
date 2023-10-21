package padrao.projeto.model;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de $" + amount + " via PayPal para " + email);
    }
}