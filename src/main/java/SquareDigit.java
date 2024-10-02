public class SquareDigit {

    public int squareDigits(int n) {

        String doubleCurrentNum = "";
        String num = Integer.toString(n);

        for (int i = 0; i < num.length(); i++) {
            String currentNum = num.substring(i, i + 1);
            int currentNumInt = Integer.parseInt(currentNum);
            doubleCurrentNum = doubleCurrentNum + (currentNumInt * currentNumInt);
        }

        return Integer.parseInt(doubleCurrentNum);
    }
}