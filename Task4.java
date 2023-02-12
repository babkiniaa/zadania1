import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите число -> ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 0, b = 0;
        while (a > 0) {
            i++;
            b = b + (a % 10);
            a = a / 10;
        }
        System.out.println(b);
        }
}

