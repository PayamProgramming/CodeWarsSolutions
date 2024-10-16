public class FindOdd {
    public static int findIt(int[] a) {
        int result = 0;
        for (int number : a) {
            result ^= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 2, 2, 3, 3, 3}));
    }
}
