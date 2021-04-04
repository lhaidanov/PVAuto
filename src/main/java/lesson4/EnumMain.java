package lesson4;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        Month month = Month.FEB;
        Month month1 = Month.APR;


        String enumValueAsString = "mar";

        month1 = Month.valueOf(enumValueAsString.toUpperCase());
        System.out.println(Arrays.asList(Month.values()));
        System.out.println(Month.APR.ordinal() == 3);
        System.out.println(Month.APR.toString().equals("APR"));
        System.out.println(Month.APR.getMonthNaturalIndex() == 4);
        System.out.println(Month.APR.getMonthNaturalIndex());

        getSeason(month);

    }

    private static void getSeason(Month month) {
        switch (month) {
            case DEC:
            case JAN:
            case FEB:
                System.out.println("WINTER");
                break;
        }

        switch (month) {
            case MAR:
            case APR:
            case MAY:
                System.out.println("SPRING");
                break;
        }

        switch (month) {
            case JUN:
            case JUL:
            case AUG:
                System.out.println("SUMMER");
                break;
        }

        switch (month) {
            case SEP:
            case OCT:
            case NOV:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Smth wrong!");
        }
    }
}
