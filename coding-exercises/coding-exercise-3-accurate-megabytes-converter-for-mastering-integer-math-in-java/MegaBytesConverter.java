public class MegaBytesConverter {
    // write code here
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
            return;
        }
    
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
    
        System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }

}