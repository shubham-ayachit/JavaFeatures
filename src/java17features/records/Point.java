package java17features.records;

//It is a record class that represents a point in a 2D plane.
//It is a final class and implicitly extends the java.lang.Record class.
//Record classes are immutable and final by default.
//Record generates constructors, accessors, equals(), hashCode(), and toString() methods for its components automatically.
public record Point(int x, int y) {
}
