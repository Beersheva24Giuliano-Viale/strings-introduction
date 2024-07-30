package telran.strings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJavaRegex {

    @Test
    public void testJavaRegex() {
        String firstNameRegex = Strings.firstName();
        String javaVariableRegex = Strings.javaVariable();

        // Test firstName regex
        assertTrue("Alice".matches(firstNameRegex));
        assertTrue("Emily".matches(firstNameRegex));
        assertFalse("alice".matches(firstNameRegex));
        assertFalse("EMILY".matches(firstNameRegex));
        assertFalse("Emi".matches(firstNameRegex));
        assertFalse("E".matches(firstNameRegex));
        assertFalse("".matches(firstNameRegex));

        // Test javaVariable regex
        assertTrue("variable".matches(javaVariableRegex));
        assertTrue("_variable".matches(javaVariableRegex));
        assertTrue("$variable".matches(javaVariableRegex));
        assertTrue("variable123".matches(javaVariableRegex));
        assertFalse("123variable".matches(javaVariableRegex));
        assertFalse("var-iable".matches(javaVariableRegex));
        assertFalse("var iable".matches(javaVariableRegex));
        assertFalse("".matches(javaVariableRegex));
    }
}
