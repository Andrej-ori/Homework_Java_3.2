public class BmiService {

    public double Bmi(double Height, double Weight) {

        double result;
        Height = Height * Height;
        result = Weight / Height;
        return result;
    }
}
