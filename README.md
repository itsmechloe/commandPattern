# Smart Home Command Pattern

This is a small Java example of the **Command Pattern**. A command wraps one
action for one device, so the `SmartHomeHub` only knows how to execute a
command. It does not need to know how a light, thermostat, or music player
works internally.

## Project structure

```text
commands/   Command interface and device-specific commands
devices/    Smart home devices and their actions
invokers/   SmartHomeHub, which runs commands
Main.java   Simple example application
```

## Run the example

From the project folder:

```bash
mkdir -p out
javac -d out Main.java commands/*.java devices/*.java invokers/*.java
java -cp out Main
```

## Adding another device

Create the device in `devices/`, then create a command in `commands/` that
implements `Command`. The hub does not need to change:

```java
public class TurnOnFanCommand implements Command {
	private final Fan fan;

	public TurnOnFanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.turnOn();
	}
}
```