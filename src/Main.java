//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите два целых числа: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean result = ((a + b) % 2 == 0) && ((a * b) % 2 != 0);

            if (result) {
                System.out.println("истинный");
            } else {
                System.out.println("ложный");
            }
        }
    }
}
