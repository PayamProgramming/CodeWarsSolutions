import java.util.Locale;

public class CountingDuplicates {

    // explanation: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
    public static int duplicateCount(String text) {
        int count = 0;
        text = text.toLowerCase(Locale.ROOT);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            char finalCh = ch;
            if (text.chars().filter(c -> c == finalCh).count() > 1) {
                count++;
            }
        }
        return count;
    }
}