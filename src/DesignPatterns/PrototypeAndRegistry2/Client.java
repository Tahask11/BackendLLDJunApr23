package DesignPatterns.PrototypeAndRegistry2;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("Taha", "Commerce", 25);
        IntelligentStudent is1 = new IntelligentStudent("Amit", "Science", 22, 95);

        Student s2 = s1.clone();
        IntelligentStudent is2 = is1.clone();

        is1.setName("Taha Shaikh");
        s1.setName("Taha Shaikh");


        System.out.println(s1);
        System.out.println(s2);

        System.out.println();

        System.out.println(is1);
        System.out.println(is2);


        StudentRegistry<Student> studentRegistry = new StudentRegistry();

        studentRegistry.registry.put("s1", s1);
        studentRegistry.registry.put("is1", is1);

        IntelligentStudent is3 = (IntelligentStudent) studentRegistry.registry.get("is1");

        System.out.println();
        System.out.println(is3);


    }
}
