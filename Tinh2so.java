package ss3_java_overview;

import java.util.Scanner;

public class Tinh2so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        String thuong = (b != 0) ? String.valueOf((double) a / b) : "Không thể chia cho 0";
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);

    }
}
