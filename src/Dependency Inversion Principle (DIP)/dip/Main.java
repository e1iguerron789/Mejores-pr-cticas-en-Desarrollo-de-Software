package dip;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor payPalProcessor = new PaymentProcessor(new PayPalPayment());
        PaymentProcessor cryptoProcessor = new PaymentProcessor(new CryptoPayment());

        creditCardProcessor.makePayment(150.0);
        payPalProcessor.makePayment(75.5);
        cryptoProcessor.makePayment(220.0);
    }
}
