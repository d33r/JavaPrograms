public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int kilobytes;
        if (kiloBytes >= 0){
            megaBytes = kiloBytes / 1024;
            kilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kilobytes + " KB" );
        } else
            System.out.println("Invalid Value");
    }

}

