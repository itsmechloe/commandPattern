package devices;

public class Thermostat {
    private int temperature = 20;

    public void increaseTemperature() {
        temperature++;
        System.out.println("Thermostat is set to " + temperature + " degrees.");
    }
}