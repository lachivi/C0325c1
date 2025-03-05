package ss3_java_overview;

import java.util.Scanner;

public class Tinhdiemtb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Toán: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhập hệ số Toán: ");
        int heSoToan = scanner.nextInt();
        System.out.print("Nhập điểm Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhập hệ số Lý: ");
        int heSoLy = scanner.nextInt();
        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = scanner.nextDouble();
        System.out.print("Nhập hệ số Hóa: ");
        int heSoHoa = scanner.nextInt();
        double tongDiem = (diemToan * heSoToan) + (diemLy * heSoLy) + (diemHoa * heSoHoa);
        int tongHeSo = heSoToan + heSoLy + heSoHoa;
        double diemTrungBinh = tongDiem / tongHeSo;
        System.out.println("--- Kết quả ---");
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}
