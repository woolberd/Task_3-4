import java.util.Scanner;
//2
public class EvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите три целых числа: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int evenCount = 0;

            if (a % 2 == 0) evenCount++;
            if (b % 2 == 0) evenCount++;
            if (c % 2 == 0) evenCount++;

            if (evenCount == 2) {
                System.out.println("истинный");
            } else {
                System.out.println("ложный");
            }
        }
    }
}
