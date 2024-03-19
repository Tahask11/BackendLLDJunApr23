package DesignPatterns.BuilderPattern2;

public class Student {
    private String name;
    private String stream;
    private int age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.stream = builder.stream;
        this.age = builder.age;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String name;
        private String stream;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStream(String stream) {
            this.stream = stream;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}