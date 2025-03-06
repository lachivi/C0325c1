package ss4_condision;

import java.util.HashMap;
import java.util.Scanner;

public class Tinhbolean {
    public static void main(String[] args) {


//    boolean a = true &&  false;
//    boolean b = ( 3 > 100) || (25 % 5 == 0);
//        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n : ");
        int n = scanner.nextInt();
//        var map = new HashMap<>()
//        if (n == 1){
//            System.out.println("one");
//        }
//        else if( n == 2){
//            System.out.println("two");
//        }
//        else if( n == 3){
//            System.out.println("three");
//        }
//        else if( n == 4){
//            System.out.println("four");
//        }
//        else if( n == 5){
//            System.out.println("five");
//        }
//        else if( n == 6){
//            System.out.println("six");
//        }
//        else if( n == 7){
//            System.out.println("seven");
//        }
//        else if( n == 8){
//            System.out.println("eight");
//        }
//        else if( n == 9){
//            System.out.println("nine");
//        }else if( n == 10){
//            System.out.println("ten");
//        }

        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Nhập sai giá trị");
        }
        /**
         * cách 2
         * ->
         */
    }
}

