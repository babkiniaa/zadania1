import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a -> ");
        int a = in.nextInt();
        System.out.print("b -> ");
        int b = in.nextInt();
        System.out.println(a + " / " + b + " = " + a/b + ", Остаток = " +  a%b);

    }
}