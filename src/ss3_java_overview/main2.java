package ss3_java_overview;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int a = 5;
        // a = a + 2;
        a += 2;
        int b = 10;
        b += 2;
//        System.in ): Tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tuổi của bạn : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên của bạn : ");
//        scanner.nextLine(); // xóa hết dữ liệu ở trong bộ nhớ
        String name = scanner.nextLine();
//        System.out.print("Hello");
//        System.out.println("Kết Quả = " + a);
//        System.out.printf("%d + %d = %d", a, b, a + b);
        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);
//        System.out.println("Chào Mứng Đến Với Lớp học Techzen");
    }
}
