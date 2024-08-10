public class StackMemoryExample {

    public static void main(String[] args) {
        int a = 5; //stored in a stack

        int factorial = calculateFactorial(a); //stored in a stack
    }

    public static int calculateFactorial(int n) {
        //if (n == 0) {
        //    return 1;
        //}
        return n * calculateFactorial(n - 1);
    }
}
