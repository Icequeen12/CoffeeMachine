import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;

        double amount = m;

        while (amount < k) {
            years++;
            amount = p * amount / 100 + amount;
        }
        System.out.println(years);
    }
}