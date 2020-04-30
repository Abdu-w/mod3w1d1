public class Part3 {
    public static void main(String []args){
        multiply(10,100);
    }

    public static float multiply(float a, float b){
        float Product = a * b;
        System.out.println(Product);
        return  Product;
    }
}
////////////////////////////////////////////////

public class Part4 {
    public static void main(String []args){
        inchToMeters(1);

    }

    public static double inchToMeters(double a){
        double conversionFactor = 39.37;
        double meters= a / conversionFactor;
        System.out.println(meters);
        return meters;
    }

}
