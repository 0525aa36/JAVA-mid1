package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String strReverse = new StringBuilder(str).reverse().toString();
        System.out.println(strReverse);

    }
}
