//put imports you need here

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> guests = new ArrayList<>();

        while (scanner.hasNext()) {
            guests.add(scanner.next());
        }

        for (int i = 1; i <= guests.size(); i++) {
            System.out.println(guests.get(guests.size() - i));
        }
    }
}