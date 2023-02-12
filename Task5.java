import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите Вес человека на Земле -> ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Вес человека на луне = " + a*0.13 );
    }
}