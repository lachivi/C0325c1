package ss3_java_overview;

import java.util.Scanner;

public class Tinhcvtg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);
        System.out.println("Chu vi hình tròn: " + chuVi);
        System.out.println("Diện tích hình tròn: " + dienTich);
    }
}
