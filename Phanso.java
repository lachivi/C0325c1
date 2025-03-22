package ss10_OOP_overview;

import java.util.Scanner;

public  class Phanso {
    double tuSo;
    double tuSoKhac;
    double mauSoKhac;
    double mauSo;
    double phanSoKhac;

    void inputData() { // nhập
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tử : ");
        tuSo = Double.parseDouble(scanner.nextLine());
        do {
            System.out.print("Nhập vào mẫu : ");
            mauSo = Double.parseDouble(scanner.nextLine());

        } while (mauSo == 0);
    }
    double layUocLonNhat(double tuSo, double mauSo) {
        if ((tuSo == 1 && mauSo == 1) || tuSo == 0 ){
            return 1;
        }
        tuSo = Math.abs(tuSo);
        for(double i = tuSo; i > 1; i--){ // tử số 5 mẫu số 10
            if (tuSo % i == 0 && mauSo % i == 0){
                return i;
            }
        }
        return 1;
        }
        void outputResult() {
            double uoclonnhat = layUocLonNhat(tuSo, mauSo);
            tuSo /= uoclonnhat;
            mauSo /= uoclonnhat;
            System.out.println("Số thập phân rút gọn : " + tuSo + " / " + mauSo);
            if (mauSo == 1){
                System.out.println("Số thập phân rút gọn: " + tuSo);
            }else {
                System.out.println("Số thập phân rút gọn : " + tuSo + " / " + mauSo);
            }

        }
        void calSum(Phanso phansokhac){
            double tuSokhac = phansokhac.tuSo;
            double mauSokhac = phansokhac.mauSo;
            double tongtuso = tuSo + mauSokhac - tuSokhac + mauSo;
            double tongmauso = mauSo + mauSokhac;
            double ucoLonNhat = layUocLonNhat(tongtuso , tongmauso);
            tongtuso /= ucoLonNhat;
            tongmauso /= ucoLonNhat;
            System.out.println(" Tổng 2 phân số là : " + tongtuso + " / " + tongmauso);
        }
    }
