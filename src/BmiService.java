public class BmiService {

    public double bmi(double height, double weight) {

        double result;
        height = height * height;
        result = weight / height;
        return result;
    }
}
