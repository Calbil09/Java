import java.util.Scanner;
class Point {
    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
class Circle {
    private Point center;
    private Point pointOnCircle;

    Circle(Point center, Point pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;
    }
    public double radius() {
        double x1 = center.getX();
        double y1 = center.getY();
        double x2 = pointOnCircle.getX();
        double y2 = pointOnCircle.getY();
        double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return r;
    }
    public double surface() {
        double r = radius();
        return Math.PI * Math.pow(r, 2);
    }
    public double length() {
        double r = radius();
        return 2 * Math.PI * r;
    }
}
public class circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input for center x1: ");
        double x1 = inp.nextDouble();
        System.out.print("Input for center y1: ");
        double y1 = inp.nextDouble();
        System.out.print("Input for Point x2: ");
        double x2 = inp.nextDouble();
        System.out.print("Input for Point y2: ");
        double y2 = inp.nextDouble();
        Point center = new Point(x1, y1);
        Point pointOnCircle = new Point(x2, y2);

        Circle result = new Circle(center, pointOnCircle);
        System.out.println("\nLength: " + result.length());
        System.out.println("Radius: " + result.radius());
        System.out.println("Surface: " + result.surface());
    }
}