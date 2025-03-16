package Q_1;

public class expression {
    public static void main(String[] args) {
        double B=4,A=3,C=2,X=5,Y=2;

        System.out.println("(a) Square root of B² + 4AC: " + Math.sqrt(B * B + 4 * A * C));
        System.out.println("(b) Square root of X + 4Y³: " + Math.sqrt(X + 4 * Math.pow(Y, 3)));
        System.out.println("(c) Cube root of product of X and Y: " + Math.cbrt(X * Y));
        System.out.println("(d) Area of a circle: " + (Math.PI * X * X));
    }
}
