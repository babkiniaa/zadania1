import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в десятичной системе -> ");
        int[] a =  new int[9];
        String s;
        s="";
        a[0]=1;a[1]=4;a[2]=5;a[3]=9;a[4]=10;a[5]=40;a[6]=50;a[7]=90;a[8]=100;
        String[] b = new String[9];
        b[0]="I";b[1]="IV";b[2]="V";b[3]="IX";b[4]="X";b[5]="XL";b[6]="L";b[7]="XC";b[8]="C";
        int i, num = in.nextInt();
        i=0;
        while (num > 0){
            i=0;
            while (num>=a[i]){
                i++;
            }
            if (num < a[i]){
                i--;
            }
            num = num - a[i];
            s =  s + b[i];
        }
        System.out.println(s);
    }
}