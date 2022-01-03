public class User {
    Command lightOn;
    Command lightOff;

    public User(Command lightOn, Command lightOff) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public void setLightOn() {
        lightOn.doIt();
    }

    public void setLightOff() {
        lightOff.doIt();
    }
}
