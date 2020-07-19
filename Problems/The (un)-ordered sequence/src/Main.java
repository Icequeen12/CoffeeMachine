import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }

        if (numbers.get(0) > numbers.get(1)) {
            System.out.println(descending(numbers));
        } else {
            System.out.print(ascending(numbers));
        }

    }

    public static boolean ascending(List<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 2; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean descending(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 2; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}