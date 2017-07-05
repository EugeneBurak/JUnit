import junit.framework.TestSuite;

/**
 * Created by java_dev on 05.07.17.
 */
public class StringUtilsJUnit3TestSuite extends TestSuite {         //You can group tests.
    public StringUtilsJUnit3TestSuite() {
        addTestSuite(StringUtilsJUnit3Test.class);
//        addTestSuite(OtherTest1.class);           //Unrealized tests.
//        addTestSuite(OtherTest2.class);           //Unrealized tests.
    }
}
