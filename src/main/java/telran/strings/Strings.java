package telran.strings;

public class Strings {
    public static String firstName() {
        // Regex for strings starting with a capital letter and rest as lowercase letters
        // Minimal length is 5 letters
        return "^[A-Z][a-z]{4,}$";
    }

    public static String javaVariable() {
        // Regex for testing syntax of Java variable names
        // Only ASCII symbols allowed
        return "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
    }
}
