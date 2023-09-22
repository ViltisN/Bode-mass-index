public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // Вес в килограммах
        double height = 1.87; // Рост в метрах

        int bmiIndex = service.calculate(weight, height);

        System.out.println("Индекс массы тела (BMI): " + bmiIndex);
    }
}