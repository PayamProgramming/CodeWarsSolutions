import java.util.ArrayList;
import java.util.List;

public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        List<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        for(int i = 0 ; i < str.length() ; i++){
            String current = str.substring(i , i+1);
            for (int j = 0 ; j < vowels.size() ; j++){
                if(current.equals(vowels.get(j))){
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("eyahdega"));
    }

}
