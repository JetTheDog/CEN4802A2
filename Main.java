public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The " + num + "th number in the Fibonacci sequence is: " + fib(num));
    }

    /**
     * Returns the nth number in the Fibonacci sequence.
     *
     * @author          Jordan Bender
     * @param  userNum  The numerical position that the user wants to find in the
     *                  Fibonacci sequence (i.e. value of 5 = 5th number in sequence).
     *
     * @return          Returns userNum for positions less than or equal to 1,
     *                  as their value in the sequence will be identical.
     *                  Otherwise, iterates through algorithm.
     */
    public static int fib(int userNum) {
        if (userNum <= 1)
            return userNum;
        return fib(userNum - 1) + fib(userNum - 2);
    }
}
