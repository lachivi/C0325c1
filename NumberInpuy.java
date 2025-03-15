package ss6_method;

import java.util.Scanner;



public class NumberInpuy {

    public class NumberInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = scanner.nextInt();


            for (int i = 1; i <= n; i++) {
                System.out.print(i + "   ");
            }
        }
    }
}
