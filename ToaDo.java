package ss10_overview;

import java.util.Scanner;


public class ToaDo {
    double x;
    double y;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập x: ");
        x = scanner.nextDouble();

        System.out.print("Nhập y: ");
        y = scanner.nextDouble();
    }

    double distanceTo(ToaDo other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}

