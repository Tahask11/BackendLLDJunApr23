package DesignPatterns.AbstractFactory;

public class Flutter {
    public void setTheme() {
        System.out.println("Theme is set");
    }

    public void setRefreshRate() {
        System.out.println("Refresh rate set");
    }

    public UIFactory createFactory(String platform) {
        return UIFactoryFactory.createUIFactory(platform);
    }
}
