public class SquareRoot {
    public static void main(String[] args) {

        int x = 25;

        System.out.print(mySqrt(x));
        
    }

    public static int mySqrt(int x) {
        
        double y = (int) x;

        return (int) Math.sqrt(y);
    }
    
}
