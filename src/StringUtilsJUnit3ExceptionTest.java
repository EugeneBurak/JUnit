import junit.extensions.ExceptionTestCase;

/**
 * Created by java_dev on 05.07.17.
 */
public class StringUtilsJUnit3ExceptionTest extends ExceptionTestCase {         //Check for exceptions
    public StringUtilsJUnit3ExceptionTest(final String name) {
        super(name, NullPointerException.class);
    }

    public void testToHexString() {
        StringUtils.toHexString(null);
    }
}
