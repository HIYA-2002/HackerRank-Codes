public class FibonacciRecursion {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int a=fibonacci(n-1);
        int b=fibonacci(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(fibonacci(n));
    }
}
