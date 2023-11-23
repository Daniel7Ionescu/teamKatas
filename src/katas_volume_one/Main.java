package katas_volume_one;

import static katas_volume_one.narcissistic.Narcissistic.*;

public class Main {

    public static void main(String[] args) {

        int number = 153;
        System.out.printf("Is %d narcissistic: %s", number, isNarcissistic(number));

        System.out.println("\n------");

        int startFrom = 0;
        int endExclusive = 2000;
        System.out.printf("All narcissistic numbers between %d up to %d :", startFrom, endExclusive);
        System.out.println(getNarcissisticNumsUpTo(startFrom, endExclusive));
    }


}
