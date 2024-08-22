public class BmiService {
    public int calculate(int weightKg, double heightMeters) {
        double index = weightKg / (heightMeters * heightMeters);
        return (int) index;
    }
}
