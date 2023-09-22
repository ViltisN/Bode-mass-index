public class BmiService {
    public int calculate(double weightInKilograms, double heightInMeters) {
        double bmiIndex = weightInKilograms / (heightInMeters * heightInMeters);
        int roundedBmiIndex = (int) bmiIndex;
        return roundedBmiIndex;
    }
}