package Homework.Homework_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        Integer n = sc.nextInt();
        Integer sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
       System.out.println(sum);

        Integer fac = 1;
        for (int i = 1; i < n; i++) {
            fac *= i + 1;
        }
        sc.close();
        System.out.println(fac);



    }
    
}
