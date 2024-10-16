public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");

        int shortest = words[0].length();

        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
