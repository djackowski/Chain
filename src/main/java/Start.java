import operations.Chain;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Your operation: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        Chain chain  = new Chain();
        int calculated = chain.calculate(operation);

        System.out.println("RESULT: " + calculated);




    }
}
