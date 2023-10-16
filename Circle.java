public class Circle {
    double radius;

    Circle() {
        this.radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(4.2);
        Circle c3 = new Circle(5);
        Circle c4 = new Circle(7);

        System.out.println("Circle1 Radius = "+c1.radius + " "+" Area = "+c1.getArea());
        System.out.println("Circle2 Radius = "+c2.radius + " "+" Area = "+c2.getArea());
        System.out.println("Circle3 Radius = "+c3.radius + " "+" Area = "+c3.getArea());
        System.out.println("Circle4 Radius = "+c4.radius + " "+" Area = "+c4.getArea());

    }
}
