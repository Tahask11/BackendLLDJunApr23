package DesignPatterns.AbstractFactory2;

public class Car {

    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
