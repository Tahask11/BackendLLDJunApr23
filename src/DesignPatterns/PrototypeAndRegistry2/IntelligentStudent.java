package DesignPatterns.PrototypeAndRegistry2;

public class IntelligentStudent extends Student {
    private int iqscore;

    public IntelligentStudent(String name, String stream, int age, int iqscore) {
        super(name, stream, age);
        this.iqscore = iqscore;
    }

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iqscore = is.iqscore;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "name = " + this.getName() +
                ", stream = " + this.getStream() +
                ", age = " + this.getAge() +
                ", iqscore = " + iqscore +
                '}';
    }
}
