public class Main {

    static boolean isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 4000 != 0) {
            return true;
        }
        return false;
        //AAAA
    }
}
