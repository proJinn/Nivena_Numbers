import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начала диапазона: ");
        long a = sc.nextInt();
        System.out.print("Введите конец диапазона: ");
        long b = sc.nextInt();
        for(long x = a; x <= b; x++){
            long c = x;
            long sum = 0;
            do{
                sum += c%10;
                c /= 10;
            }while(c > 9);
            sum += c;
            if(x%sum == 0)
                System.out.println("" + x + " / " + sum + " = " + x/sum);
        }

    }
}
