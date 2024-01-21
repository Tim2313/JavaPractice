package utils;

import java.util.Arrays;

public class TestUtils {

    public static void testFailed(String description) {
        throw new AssertionError(description);
    }

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            String massagePattern = "\nactual = '%d'\nexpected = '%d'\nThere are not the same!";
            String massage = String.format(massagePattern, actual, expected);
            throw new AssertionError(massage);
        }
    }

    public static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            String massagePattern = "\nactual = '%s'\nexpected = '%s'\nThere are not the same!";
            String massage = String.format(massagePattern, actual, expected);
            throw new AssertionError(massage);
        }
    }

    public static void assertEquals(boolean actual, boolean expected) {
        if (actual != expected) {
            String massagePattern = "\nactual = '%b'\nexpected = '%b'\nThere are not the same!";
            String massage = String.format(massagePattern, actual, expected);
            throw new AssertionError(massage);
        }
    }

    public static void assertEquals(int[] actual, int[] expected) {
        if (!Arrays.equals(actual, expected)) {
            String massagePattern = "\nactual = '%s'\nexpected = '%s'\nThere are not the same!";
            String actualAr = Arrays.toString(actual);
            String expectedAr = Arrays.toString(expected);
            String massage = String.format(massagePattern, actualAr, expectedAr);
            throw new AssertionError(massage);
        }
    }
}
