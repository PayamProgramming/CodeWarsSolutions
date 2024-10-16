public class BraceChecker {

    public boolean isValid(String braces) {
        while (braces.contains("()") || braces.contains("[]") || braces.contains("{}")) {
            braces = braces.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return braces.isEmpty();
    }

    public static void main(String[] args) {
        BraceChecker checker = new BraceChecker();
        System.out.println(checker.isValid("()"));
        System.out.println(checker.isValid("[(])"));
    }
}