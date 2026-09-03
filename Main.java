import commands.IncreaseTemperatureCommand;
import commands.PlayMusicCommand;
import commands.TurnOffLightCommand;
import commands.TurnOnLightCommand;
import devices.Light;
import devices.MusicPlayer;
import devices.Thermostat;
import invokers.SmartHomeHub;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer("Evening Relaxation");

        SmartHomeHub hub = new SmartHomeHub();

        hub.setCommand(new TurnOnLightCommand(livingRoomLight));
        hub.pressButton();

        hub.setCommand(new IncreaseTemperatureCommand(thermostat));
        hub.pressButton();

        hub.setCommand(new PlayMusicCommand(musicPlayer));
        hub.pressButton();

        hub.setCommand(new TurnOffLightCommand(livingRoomLight));
        hub.pressButton();
    }
}