public class CreditPaymentService {
    public static int calculate(double p, double s, int year) {
        int n = 12 * year;
        p = p / 100 / 12;

        return (int) Math.round(s * (p + p / (Math.pow(1 + p, n) - 1)));
    }
}
