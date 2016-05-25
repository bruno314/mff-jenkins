

public class fib{

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
//        System.out.println("Hello, World");
//        System.out.println(fib.fib(6));
    }

    public static int fib(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 1;
        return fib(n-1)+fib(n-2);
    }
}
