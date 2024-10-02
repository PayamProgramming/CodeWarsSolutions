public class FindOdd {
    public static int findIt(int[] a) {
        int result = 0;
        for (int number : a) {
            result ^= number;
        }
        return result;
    }
}
