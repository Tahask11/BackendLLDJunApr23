package lambdas;

@FunctionalInterface
public interface DemoFuncInterface {
    static void fun3() {
        System.out.println("I am a static method");
    }

    void fun(); //SAM

    default void fun2() {
        System.out.println("I am a default method");
    }
}
