import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Main   {

    public static void main(String[] args) {
	// write your code here
    }

    public void testIsEmpty() {
        boolean actual = StringUtils.isEmpty(null);
        assertTrue(actual);

        actual = StringUtils.isEmpty("");
        assertTrue(actual);

        actual = StringUtils.isEmpty(" ");
        assertFalse(actual);

        actual = StringUtils.isEmpty("some string");
        assertFalse(actual);
    }
}
