package IntroToOOPs;

public class Student {
    public String name;
    protected int age;
    String batch; //Default
    private int id;

    void printData() {
        id = 10;
        System.out.println(id);
    }

    //Getter
    int getId() {
        return this.id;
    }

    //Setter
    void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
}
