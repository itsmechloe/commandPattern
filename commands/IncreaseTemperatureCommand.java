package commands;

import devices.Thermostat;

public class IncreaseTemperatureCommand implements Command {
    private final Thermostat thermostat;

    public IncreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}