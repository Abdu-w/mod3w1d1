public class Mod3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        multiply(10,100);
        inchToMeters(1);
    }

    public static float multiply(float a, float b){
        float Product = a * b;
        System.out.println(Product);
        return  Product;
    }
      public static double inchToMeters(double a){
        double conversionFactor = 39.37;
        double meters= a / conversionFactor;
        System.out.println(meters);
        return meters;
    }


}
