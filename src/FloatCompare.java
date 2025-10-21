import java.util.Scanner;
//4
public class FloatCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            double num1 = sc.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = sc.nextDouble();

            double rounded1 = Math.round(num1 * 1000.0) / 1000.0;
            double rounded2 = Math.round(num2 * 1000.0) / 1000.0;

            if (rounded1 == rounded2) {
                System.out.println("Они одинаковые");
            } else {
                System.out.println("Они разные");
            }

            System.out.println();
        }
    }
}

