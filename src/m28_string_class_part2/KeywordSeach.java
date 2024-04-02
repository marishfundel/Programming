package m28_string_class_part2;

public class KeywordSeach {
    public static void main(String[] args) {
        String text = "Code without tests is broken by design.";
        String keyword = "Java";
        boolean result = containsKeyword(text, keyword);
        System.out.println(result);

    }

    public static boolean containsKeyword(String text, String keyword) {
        text = text.toLowerCase();
        keyword = keyword.toLowerCase();
        text.contains(keyword);
        return text.contains(keyword);
    }

}
