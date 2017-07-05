import junit.extensions.RepeatedTest;

/**
 * Created by java_dev on 05.07.17.
 */
public class StringUtilsJUnit3RepeatedTest extends RepeatedTest {           //You can run the same test several times.
    public StringUtilsJUnit3RepeatedTest() {
        super(new StringUtilsJUnit3Test(), 100);
    }
}
