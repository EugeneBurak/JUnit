import junit.framework.Assert;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by java_dev on 05.07.17.
 */
public class StringUtilsJUnit4Test extends Assert {
    private final Map<String, byte[]> toHexStringData = new HashMap<String, byte[]>();

    @Before
    public void setUpToHexStringData() {            //Indicates the methods that will be called before the test is run.
        toHexStringData.put("", new byte[0]);
        toHexStringData.put("01020d112d7f", new byte[] { 1, 2, 13, 17, 45, 127 });
        toHexStringData.put("00fff21180", new byte[] { 0, -1, -14, 17, -128 });
        //...
    }


    @BeforeClass            //Indicates the methods that will be called before the instance of the test class is created.
    /*
    Not used
     */

    @After          //Indicates the methods that will be called after the test is run.
    public void tearDownToHexStringData() {
        toHexStringData.clear();
    }

    @AfterClass
    /*
    Not used
     */

    @Test
    public void testToHexString() {
        for (Map.Entry<String, byte[]> entry : toHexStringData.entrySet()) {
            final byte[] testData = entry.getValue();
            final String expected = entry.getKey();
            final String actual = StringUtils.toHexString(testData);
            assertEquals(expected, actual);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testToHexStringWrong() {
        StringUtils.toHexString(null);
    }

    @Ignore         //To disable the test.
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }
}
