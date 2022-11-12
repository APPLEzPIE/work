import java.util.Scanner;

public class java2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number1 = number;
        int next =0;
        do {
            int last = number%10;
            next = next*10+last;
            number = number/10;
        }while (number>0);
        if(next == number1)
        {
        System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}