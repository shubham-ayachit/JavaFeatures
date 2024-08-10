
@FunctionalInterface
public interface Convert<F, T> {
    T convert(F from);

    default void print() {
        System.out.println("Hello, World!");
    }
}
