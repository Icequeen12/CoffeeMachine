import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // put your code here
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }

        for (int number : numbers) {
            System.out.print(--number + " ");
        }

    }
}