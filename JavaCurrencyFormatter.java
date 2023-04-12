import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    // 12324.134
    // US: $12,324.13
    // India: Rs.12,324.13
    // China: ￥12,324.13
    // France: 12 324,13 €
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        NumberFormat indiFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        indiFormat.setCurrency(Currency.getInstance("INR"));
        String indi = indiFormat.format(payment);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + indi);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
