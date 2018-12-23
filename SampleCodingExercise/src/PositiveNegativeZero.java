public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes > 0){
            int megaBytes = kiloBytes / 1024;
            int kilobytes = megaBytes * 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + kilobytes + "KB" );
        } else if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
    }

}
