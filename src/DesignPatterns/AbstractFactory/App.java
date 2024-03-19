package DesignPatterns.AbstractFactory;

public class App {
    public static void styleButton(Button b, String style) {
        System.out.println("The button getting clicked is");
        b.onClick();
    }

    public static void main(String[] args) {

        // Creating new flutter App Factory Creator
        Flutter flutter = new Flutter();

        // Calling Factory Method to create different type of Factories based on param.
        UIFactory androidUIFactory = flutter.createFactory("Android");
        UIFactory iosUIFactory = flutter.createFactory("IOS");


        //Calling elements creator from individual Factory
        Button androidButton = androidUIFactory.createButton();
        Dropdown androidDD = androidUIFactory.createDropdown();
        Button iosButton = iosUIFactory.createButton();
        Dropdown iosDD = iosUIFactory.createDropdown();


        //Perform operation on elements of different
        androidButton.onClick();
        androidDD.onClick();
        iosButton.onClick();
        iosDD.onClick();


/*
        OR
        FlutterAndroid flutterAndroid = new FlutterAndroid();
        UIFactory androidUIFactory1 = flutterAndroid.createUIFactory();
        FlutterIOS flutterIOS = new FlutterIOS();
        UIFactory iosUIFactory1 = flutterIOS.createUIFactory();
*/


        // Calling generic methods to perform operation on different element types
        styleButton(androidButton, "size:0");
        styleButton(iosButton, "size:0");
    }
}
