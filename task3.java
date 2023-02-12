import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Введите число -> ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = 1000, i = 0, j = 1;
        int b[] = new int[n];
        while (a > 0) {
            i++;
            b[i] = a % 10;
            a = a / 10;
        }
        if (i == 1){
            System.out.print("Число полиндром ");
        } else {
            while ((j <= i/2) && (b[j] == b[i-j+1])) {
                j++;
            }
            if (i/2 == j-1) {
                System.out.print("Число полиндром ");
            } else {
                System.out.print("Число не полиндром");
            }
        }
    }

}
