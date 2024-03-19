package DesignPatterns.PrototypeAndRegistry2;

import java.util.HashMap;

public class StudentRegistry<T extends Student> {
    public HashMap<String, Student> registry = new HashMap<>();

}
