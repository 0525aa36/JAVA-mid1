package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //두 문자열 동일한지 비교
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // 두 문자열을 대소문자 구분 없이 비교

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 두 문자열 사전 순으로 비교
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // 두 문자열 대소문자 구분 없이 사전적으로 비교

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); // 문자열이 특정 접두사로 시작하는지 확인
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!")); // 문자열이 특정 접미사로 끝나는지 확인
    }
}
