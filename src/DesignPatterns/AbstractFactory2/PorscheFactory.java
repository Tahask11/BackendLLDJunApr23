package DesignPatterns.AbstractFactory2;

public class PorscheFactory implements CarFactory, Race {

    private final String make = "Porsche";

    @Override
    public Car getCar(String model, int year, String color) {
        return new Car(model, year, color);
    }

    @Override
    public void race() {
        System.out.println(this.toString() + ".... Goes Zoooooom!!!!");
    }
}
