public class Volume {
    double length;
    double breath;
    double height;

    Volume(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;

    }

    public double getVolume() {
        return (this.length * this.breath * this.height);

    }

    public static void main(String[] args) {

        Volume vol = new Volume(10, 20, 30);

        double v = vol.getVolume();

        System.out.print("Volume = "+v);

    }

}
