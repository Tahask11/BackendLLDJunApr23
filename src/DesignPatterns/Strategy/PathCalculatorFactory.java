package DesignPatterns.Strategy;

public class PathCalculatorFactory {

    public static IPathCalculatorStrategy carStrategy = new CarPathCalculator();
    public static IPathCalculatorStrategy bikeStrategy = new BikePathCalculator();
    public static IPathCalculatorStrategy walkStrategy = new WalkPathCalculator();

    public static IPathCalculatorStrategy getPathStrategy(String mode) {
        if (mode == "car") {
            return carStrategy;
        }
        if (mode == "bike") {
            return bikeStrategy;
        }
        if (mode == "walk") {
            return walkStrategy;
        }
        return null;
    }
}
