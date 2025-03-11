import decorator.CreditCardPayment;
import decorator.DiscountCode;
import decorator.Payment;
import decorator.ProcessingFee;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(100.0);
        payment = new ProcessingFee(payment);
        System.out.println(payment.getDescription() + ": " + payment.getCost());
        payment = new DiscountCode(payment);
        System.out.println(payment.getDescription() + ": " + payment.getCost());
    }
}