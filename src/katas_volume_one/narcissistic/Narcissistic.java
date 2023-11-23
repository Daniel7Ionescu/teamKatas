package katas_volume_one.narcissistic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Narcissistic {
    static public List<Integer> getNarcissisticNumsUpTo(int starter, int enderExclusive) {
        List<Integer> result = new ArrayList<>();
        IntStream.range(starter, enderExclusive)
                .filter(num -> isNarcissistic(num))
                .forEach(num -> result.add(num));

        return result;
    }

    static public boolean isNarcissistic(int num) {
        if (num <= 0) return false;
        if (num >= 1 && num < 10) return true;

        int toPower = countDigits(num);
        int result = 0;
        int checkNum = num;

        while (checkNum > 0) {
            result += (int) Math.pow(checkNum % 10, toPower);
            checkNum = checkNum / 10;
        }

        return result == num;
    }

    private static int countDigits(int number) {
        if (number == 0)
            return 0;
        return 1 + countDigits(number / 10);
    }

    private static int digitsFromString(int num) {
        return String.valueOf(num).length();
    }
}
