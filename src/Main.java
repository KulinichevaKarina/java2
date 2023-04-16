public class Main {
    public static void main(String[] args) {
        double percent = 9.99;// процентная ставка
        int sum = 1000000;// сумма долга
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int year = 1;// срок кредита
        System.out.println(creditPaymentService.calculate(percent, sum, year));

        year = 2;
        System.out.println(creditPaymentService.calculate(percent, sum, year));

        year = 3;
        System.out.println(creditPaymentService.calculate(percent, sum, year));
    }
}