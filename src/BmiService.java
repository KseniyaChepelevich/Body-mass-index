public class BmiService {
    public double calculate(float weight, int height) {

        float index = weight * 10000 / (height * height);
        double result = (Math.round(index * 100) / 100.0);

        return result;
    }

}
