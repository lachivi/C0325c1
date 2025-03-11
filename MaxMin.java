package ss4_condision;

import java.util.Scanner;


public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
//        if(a>b){
//            System.out.println("Max: " + a);
//            System.out.println("Min: " + b);
//        }else {
//            System.out.println("Max: " + b);
//            System.out.println("Min: " + a);
//        }
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

