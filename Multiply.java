public class Multiply {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));        
        System.out.println(multiply(2.5, 4.0));    
        System.out.println(multiply(2, 3, 4));     
}
}