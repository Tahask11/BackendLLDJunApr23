package DesignPatterns.BuilderPattern2;

public class client {

    public static void main(String[] args) {

        Student student = Student.getBuilder()
                .setName("Taha")
                .setStream("Commerce")
                .setAge(25)
                .build();

        System.out.println(student.toString());

    }
}


