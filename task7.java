import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        System.out.print("Введите число -> ");
        Scanner in = new Scanner(System.in);
        int i;
        int n = in.nextInt();
        int a[] = new int[n+1];
        a[0] = 0; a[1] = 1;
        for (i=2;i<=n;i++){
            a[i] = a[i-1] + a[i-2];
            System.out.println(a[i-2]);
        }
        System.out.println(a[n-1]);
        System.out.println(a[i]);
    }
}