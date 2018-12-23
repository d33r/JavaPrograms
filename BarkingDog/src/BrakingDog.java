public class M {

    public static void main(String[] args) {

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay > 8 && hourOfDay < 22) {
        return true;
            System.out.println(barking);
        }
        else if(hourOfDay < 0 || hourOfDay > 23);
        return false;
    }
}

