package ss3_java_overview;

import java.util.Scanner;

public class Tinhbienso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển số xe: ");
        String bienSo = scanner.nextLine();
        int tongChuSo = 0;
        for (char c : bienSo.toCharArray()) {
            if (Character.isDigit(c)) {
                tongChuSo += Character.getNumericValue(c);
            }
        }
        int soNut = tongChuSo % 10;
        System.out.println("Tổng các chữ số: " + tongChuSo);
        System.out.println("Số nút của biển số xe: " + soNut);
    }
}
