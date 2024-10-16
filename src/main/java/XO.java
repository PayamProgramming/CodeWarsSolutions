public class XO {

    public static boolean getXO(String str) {

        // Good Luck!!

        int xCount = 0;
        int oCount = 0;
        String x = "x";
        String o = "o";
        boolean isSame = false;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(x)) {
                xCount++;
            } else if (str.substring(i, i + 1).equals(o)) {
                oCount++;
            }
        }
        if (xCount == oCount) {
            isSame = true;
        }
        return isSame;
    }


    public static void main(String[] args) {
        System.out.println(getXO("xxooo"));
    }
}