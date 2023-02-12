import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        double d=(b*b)-(4*a*c);
        if (d==0){
            System.out.println("1 корень, x= " + (-1*(b/(2*a))));
        }
        else if (d<0) {
            System.out.println("Нет кореней");
        }
        else{
            System.out.println("Уравнение имеет 2 квадратных корня");
            System.out.println("x1= "+ ((-1*b)+(float)Math.sqrt(d))/(2*a));
            System.out.println("x2= "+ ((-1*b)-(float)Math.sqrt(d))/(2*a));
        }
    }
}