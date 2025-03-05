package ss3_java_overview;

public class Tinhaij {
        public static void main(String[] args) {
            int i = 1, j = 1;
            int a = i++ + j++;
            System.out.println("Câu a: a = " + a);
            i = 1; j = 1;
            a = i++ + ++j;
            System.out.println("Câu b: a = " + a);
            i = 1; j = 1;
            a = ++i + j++;
            System.out.println("Câu c: a = " + a);
            i = 1; j = 1;
            a = ++i + ++j;
            System.out.println("Câu d: a = " + a);
            i = 1; j = 1;
            a = i++ + j++ + i++ + j++;
            System.out.println("Câu e: a = " + a);
            i = 1; j = 1;
            a = ++i + ++j + i++ + j++;
            System.out.println("Câu f: a = " + a);
            i = 1;
            a = i++ + ++i - i-- - --i;
            System.out.println("Câu g: a = " + a);
            int a1 = 10;
            a1 += a1++ + ++a1;
            System.out.println("Câu h: a = " + a1);
        }
    }
