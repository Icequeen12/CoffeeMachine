import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase();

        if (word.charAt(0) == 'j') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}