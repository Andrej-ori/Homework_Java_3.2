import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        Scanner num = new Scanner(System.in);

        double Height, Weight;

        System.out.println("\nПриложение для расчета Индекса Массы Тела");

        System.out.print("\nВведите рост  (в метрах через запятую):");
        Height = num.nextDouble();

        System.out.print("\nВведите вес (в килогграммах через запятую):");
        Weight = num.nextDouble();

        Double Bmi = servise.Bmi(Height, Weight);

        System.out.println("\nИндекс Массы Тела: " + Bmi);
    }
}
