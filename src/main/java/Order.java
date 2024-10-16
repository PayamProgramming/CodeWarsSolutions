public class Order {

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        String[] wordsArray = words.split(" ");
        String[] sortedWords = new String[wordsArray.length];
        for (String word : wordsArray) {
            int index = Integer.parseInt(word.replaceAll("[^0-9]", "")) - 1;
            sortedWords[index] = word;
        }
        return String.join(" ", sortedWords);
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
