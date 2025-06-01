package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 ' Java'가 포함되어 있는지: " + str.contains("Java")); // 문자열이 특정 문자열을 포함하고 있는지 확인
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java", 10)); // 문자열이 처음 등장하는 위치 반환
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java")); // 문자열이 마지막으로 등장하는 위치 반환
    }
}
