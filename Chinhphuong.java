package ss6_method;

import java.util.Scanner;


public class Chinhphuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dương từ bàn phím: ");
        int x = scanner.nextInt();

        int squareRoot = (int) Math.sqrt(x);

        if (squareRoot * squareRoot == x) {
            System.out.println("Số " + x + " là số chính phương.");
        } else {
            System.out.println("Số " + x + " không phải là số chính phương.");
        }

    }
}

