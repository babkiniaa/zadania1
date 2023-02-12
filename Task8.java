import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=25, min=0, d;
        double a = Math.ceil((Math.random() * ((max - min) + 1)) + min);
        int b = (int) a;
        char letter = (char)((int)'a' + b);
        b = (int)((char)letter - 'a');
        System.out.println("Введите букву (маленькую) ->");
        char c = in.next().charAt(0);
        while (c != letter){
            d = (int)((char)c - 'a');
            if (b - d > 0){
                System.out.println("Число находится ближе к концу алфавита");
            }
            else{
                System.out.println("Число находится ближе к началу алфавита");
            }
            System.out.println("Введите букву еще раз ->");
            c = in.next().charAt(0);
        }
        System.out.println("Наконец-то Угадали!");
    }
}