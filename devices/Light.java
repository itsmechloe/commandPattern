package devices;

public class Light {
    private int brightness = 0;

    public void turnOn() {
        brightness = 100;
        System.out.println("Light is on at " + brightness + "% brightness.");
    }

    public void turnOff() {
        brightness = 0;
        System.out.println("Light is off.");
    }
}