public class Rectangle {
    double width;
    double length;
    double area;
    String color;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String setColor(String color) {
        this.color = color;

        return color;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();

        rec1.setLength(10);
        rec1.setWidth(20);
        String color1 = rec1.setColor("Pink");

        rec2.setLength(20);
        rec2.setWidth(10);
        String color2 = rec2.setColor("Pink");

        if (rec1.getArea() == rec2.getArea() && color1 == color2) {
            System.out.print("Matching Rectangle");
        } else {
            System.out.print("Non-Matching Rectangle");
        }

    }

}
