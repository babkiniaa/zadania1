import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите число -> ");
        Scanner in = new Scanner(System.in);
        int i = 3;
        int a = in.nextInt();
        if (a % 2 == 0 && a > 2) {
            System.out.println("Составное");
        } else {
            while ((i <= Math.ceil(Math.sqrt(a)) && (a % i != 0))) {
                i = i + 2;
            }
            if (i >= Math.sqrt(a)) {
                System.out.println("Простое");
            } else {
                System.out.println("Составное");
            }

        }
    }
}