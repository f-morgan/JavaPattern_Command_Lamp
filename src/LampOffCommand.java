public class LampOffCommand implements Command{
    protected Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void doIt() {
        lamp.turnOff();
    }
}
