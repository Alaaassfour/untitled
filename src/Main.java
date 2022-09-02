import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 2;
        z = 2;
       double v=x/y;
       double v1= v + z;

        System.out.println(v1);
        byte b=120;
        int i=b;
        System.out.println(b);

        int ii=134;
        byte bb = (byte) ii;
        System.out.println(bb);
        int ij=ii%100;
        System.out.println(ij);

        int t1=16;
        System.out.println(t1++);
        System.out.println(t1);
        System.out.println(++t1);
        System.out.println(t1);

        boolean test = false;
        boolean test1 = true;
        System.out.println(t1==ii);
        int l1=4;
        if (l1*l1>10 && l1*l1<20) {
            System.out.println("yes");
        }
        else {
            System.out.println("nope");
        }
        int x12=4;
        x12+=5;
        System.out.println(x12);
        int xx1=x12>5 ? 10:19;




    Scanner scanner = new Scanner  (System.in);
    String Line = scanner.nextLine();
        System.out.println(Line + " - your string'");




        double x1, y1, z1, v2;
        x1 = 2.2d;
        y1 = 24.4d;
        z1 = 2.7d;
        v2 = (x1 * y1) + z1;

        System.out.println(v2);

    }
}
