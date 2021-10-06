public class Main {
    public static void main(String[] args) {
        float weight = 57F;
        int height = 169;
        float index = weight * 10000 / (height * height);
        System.out.println(Math.round(index * 100) / 100.0);

    }

}
