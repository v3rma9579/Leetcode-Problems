public class Fib {
    public static void main(String[] args) {

        int n = 2;

        System.out.print(fib(n));
        
    }

    public static int fib(int n) {

        if(n == 0)
        return 0;

        if(n==1)
        return 1;
        
        return fib(n-1) + fib(n-2);
    }
    
}
