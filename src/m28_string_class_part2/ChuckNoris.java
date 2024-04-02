package m28_string_class_part2;

public class ChuckNoris {
    public static void main(String[] args) {
        String name = "  chuck noris ";

        name = (name.trim()).toUpperCase();
        System.out.print(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".");
    }
}
