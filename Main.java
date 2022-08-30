public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The " + num + "th number in the Fibonacci sequence is: " + fib(num));
    }
    public static int fib(int userNum) {
        if (userNum <= 1)
            return userNum;
        return fib(userNum - 1) + fib(userNum - 2);
    }
}