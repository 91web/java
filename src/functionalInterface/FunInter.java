package functionalInterface;

// Declare functional interfaces
@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface Function<T, R> {
    R apply(T t);
}

@FunctionalInterface
interface Supplier<T> {
    T get();
}

@FunctionalInterface
interface UnaryOperator<T> {
    T apply(T t);
}

@FunctionalInterface
interface BinaryOperator<T> {
    T apply(T t1, T t2);
}

@FunctionalInterface
interface BiPredicate<T, U> {
    boolean test(T t, U u);
}

@FunctionalInterface
interface BiConsumer<T, U> {
    void accept(T t, U u);
}

@FunctionalInterface
interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

@FunctionalInterface
interface Runnable {
    void run();
}

// Main class to implement the interfaces using lambda expressions
public class FunInter{
    public static void main(String[] args) {
        // 1. Predicate<T>
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // true

        // 2. Consumer<T>
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!"); // Prints "Hello, World!"

        // 3. Function<T, R>
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java")); // 4

        // 4. Supplier<T>
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get()); // Prints a random number

        // 5. UnaryOperator<T>
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5)); // 25

        // 6. BinaryOperator<T>
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 3 and 5: " + add.apply(3, 5)); // 8

        // 7. BiPredicate<T, U>
        BiPredicate<String, Integer> isLengthEqual = (str, len) -> str.length() == len;
        System.out.println("Does 'Java' have length 4? " + isLengthEqual.test("Java", 4)); // true

        // 8. BiConsumer<T, U>
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " is " + age + " years old.");
        printDetails.accept("Alice", 30); // Prints "Alice is 30 years old."

        // 9. BiFunction<T, U, R>
        BiFunction<Integer, Integer, Double> power = (base, exponent) -> Math.pow(base, exponent);
        System.out.println("2^3: " + power.apply(2, 3)); // 8.0

        // 10. Runnable
        Runnable task = () -> System.out.println("Task executed!");
        task.run(); // Prints "Task executed!"
    }
}
