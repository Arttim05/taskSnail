import java.util.Scanner;
public class Snail {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner h = new Scanner(System.in);

        int a1 = a.nextInt();
        int b1 = a.nextInt();
        int h1 = a.nextInt();

        if (a1 >= h1) {
            System.out.println(1);
        } else if (a1 <=b1) {
            System.out.println("Impossible");
        } else {
            int step = a1 - b1;
            int result = (h1 - a1) / step;
            System.out.println(result + 1);
        }
    }
}
