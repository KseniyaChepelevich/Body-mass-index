public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double highIndex = service.calculate(80, 160);
        System.out.println(highIndex);

        double averageIndex = service.calculate(57, 169);
        System.out.println(averageIndex);

        double shortIndex = service.calculate(45, 168);
        System.out.println(shortIndex);

    }

}
