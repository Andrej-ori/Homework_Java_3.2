import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        Scanner num = new Scanner(System.in);

        double height, weight;

        System.out.println("\nПриложение для расчета Индекса Массы Тела");

        System.out.print("\nВведите рост  (в метрах через запятую):");
        height = num.nextDouble();

        System.out.print("\nВведите вес (в килогграммах через запятую):");
        weight = num.nextDouble();

        Double bmi = servise.bmi(height, weight);

        System.out.println("\nИндекс Массы Тела: " + bmi);
    }
}
