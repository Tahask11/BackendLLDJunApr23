package DesignPatterns.AbstractFactory2;

public class app {
    public static void main(String[] args) {
        // Concrete Factory of type Abstract Factory
        CarFactory ferrariFactory = new FerrariFactory();
        CarFactory porscheFactory = new PorscheFactory();

        //Concrete Object of type Abstract Object
        Car ferrariF50 = ferrariFactory.getCar("F150", 1997, "Red");
        Car porsche911Turbo = porscheFactory.getCar("911 Turbo", 1998, "Yellow");

//        ferrariF50.race();
//        porsche911Turbo.race();









    }
}
