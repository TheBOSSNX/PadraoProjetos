package padrao.projeto.model;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de $" + amount + " via cartão de crédito " + cardNumber);
    }
}
