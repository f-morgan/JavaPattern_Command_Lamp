public class LampOnCommand implements Command {
    protected Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void doIt() {
        lamp.turnOn();
    }

}
