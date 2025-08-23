//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("Super", "Asus", "72W");
        Monitor monitor = new Monitor("Super", "Asus", 27, "1920x1080");
        PersonalComputer pc = new PersonalComputer("Super", "Asus", computerCase, monitor, new Motherboard("x51", "MSI", 8, 2, "1.0"));

//        pc.getMonitor().drawPixelAt(10, 10, "Red");
//        pc.getMotherboard().loadProgram("Windows Os");
//        pc.getComputerCase().pressPowerButton();


        pc.powerUp();
    }


}