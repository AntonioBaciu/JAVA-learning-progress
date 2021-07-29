public class MegaBytesConverter {

    // calculate the megabytes and the remaining kilobytes
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024; // the int will always return the whole number part (12.3445) will be 12
            int remainder = kiloBytes % 1024; 
            System.out.println(kiloBytes + " KB " + "= " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
