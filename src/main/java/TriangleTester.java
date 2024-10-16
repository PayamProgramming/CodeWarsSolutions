class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){

        return a > b + c && b > a + c && c > b + a;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
    }
}