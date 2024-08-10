public class HeapMemoryExample {


    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            MyObjectClass myObject = new MyObjectClass();
        }

        System.gc();

        for (int i = 0; i < 1000000; i++) {
            MyObjectClass myObject = new MyObjectClass();
        }
    }
}

class MyObjectClass {
    double[] myArray = new double[1000]; //for high memory allocation
}
