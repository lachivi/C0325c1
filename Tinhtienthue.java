package ss3_java_overview;

import java.util.Scanner;

public class Tinhtienthue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        String ten = scanner.nextLine();
        System.out.print("Nhập vào số lượng : ");
        int sl = scanner.nextInt();
        System.out.print("Nhập vào đơn giá : ");
        double dg = scanner.nextDouble();
        double tong = sl * dg;
        double thue = tong * 0.1;
        System.out.println("Tên Sản Phẩm : " + ten);
        System.out.println("Tổng Tiền : " + tong);
        System.out.println("Thuế VAT : " + thue);

    }
}
