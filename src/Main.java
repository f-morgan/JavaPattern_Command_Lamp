public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        User user = new User(new LampOnCommand(lamp), new LampOffCommand(lamp));

        user.setLightOn();
        user.setLightOff();
        user.setLightOn();

    }
}
