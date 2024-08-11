package java17features.records;

//It is a record class that represents an employee.

//Benefits of using records:
//1. Concise code: Records reduce boilerplate code.
//2. Immutable: Records are immutable by default.
//3. Read-only: Records provide read-only access to their components.
//4. Value-based: Records are value-based classes.
//5. Easy to use: Records are easy to use and understand.
//6. Easy to maintain: Records are easy to maintain.
//7. Easy to test: Records are easy to test.
//8. Easy to debug: Records are easy to debug.
public record Employee(String name, int age, String department, double salary) {

}
