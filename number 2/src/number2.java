import java.util.Scanner;

public class number2 {
    public static void main(String [] arg)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите первое число");
        float a = scanner.nextFloat ();

        System.out.println("Введите второе число");
        float b = scanner.nextFloat();

        float с = a + b;

        System.out.printf("Результат: %.4f", +с);

    }
}
