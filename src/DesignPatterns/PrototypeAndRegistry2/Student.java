package DesignPatterns.PrototypeAndRegistry2;

public class Student implements Prototype<Student> {
    private String name;
    private String stream;
    private int age;

    public Student(String name, String stream, int age) {
        this.name = name;
        this.stream = stream;
        this.age = age;
    }

    public Student(Student s) {
        this.name = s.name;
        this.stream = s.stream;
        this.age = s.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return this.stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", age=" + age + '}';
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
