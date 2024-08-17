public class BmiService {
    public int calculate(int weight_kg, double height_meters) {
        double index = weight_kg / (height_meters * height_meters);
        return (int) index;
    }
}
