public class App {
    public static void main(String[] args) throws Exception {
        Light light = new Light();
        Command turnOn = new TurnOnLight(light);    
        Command turnOff = new TurnOffLight(light);
        turnOn.execute();
        turnOff.execute();
    }
}
