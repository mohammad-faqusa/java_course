public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, "1080 x 1920");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePc = new PersonalComputer("D222l", "Dell", theMonitor, theCase, theMotherBoard);

//        thePc.getMonitor().drawPexilAt(10, 10, "red");
//        thePc.getMotherBoard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();

    }
}
