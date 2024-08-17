public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 98;
        double height_meters = 1.87;
        int index = service.calculate(weight_kg, height_meters); // должно получиться 28
        System.out.println(index);
    }
}