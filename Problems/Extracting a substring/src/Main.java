import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        quote = quote.substring(a, b + 1);
        System.out.println(quote);
    }
}