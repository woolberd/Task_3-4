import java.util.Scanner;
//3
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите год: ");
            int year = sc.nextInt();

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println("ДА");
            } else {
                System.out.println("НЕТ");
            }
        }
    }
}
