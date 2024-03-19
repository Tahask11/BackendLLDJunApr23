package DesignPatterns.PrototypeAndRegistry2;

public interface Prototype<T extends Student> {
    public T clone();
}
