package ss10_OOP_overview;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh : ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm toán : ");
        mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm văn");
        literatureScore = scanner.nextDouble();
    }

    double Tongdtb() {
        return (mathScore + literatureScore) / 2;
    }

    void outputResult() {
        System.out.println("Học sinh tên : " + name);
        System.out.println("Có điểm toán : " + mathScore);
        System.out.println("Có điểm văn : " + literatureScore);
        System.out.println("Điểm trung bình :  " + Tongdtb());

    }


}
