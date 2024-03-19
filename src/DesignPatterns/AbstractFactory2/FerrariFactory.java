package DesignPatterns.AbstractFactory2;

public class FerrariFactory implements CarFactory, Race {

    private final String make = "Porsche";

    @Override
    public Car getCar(String model, int year, String color) {
        return new Car(model, year, color);
        /*{
            private final String make = "Ferrari";
            private final String model = "F150";
            private final int year = 1998;

            @Override
            public void race() {
                System.out.println(this.toString() + ".... Goes Zoooooooom!!!!!");
            }

            @Override
            public String toString() {
                return "FerrariFactory{" +
                        "make='" + make + '\'' +
                        ", model='" + model + '\'' +
                        ", year=" + year +
                        '}';
            }*/
    }

    @Override
    public void race() {
        System.out.println(this.toString() + ".... Goes Vroooooom!!!!");
    }
}
